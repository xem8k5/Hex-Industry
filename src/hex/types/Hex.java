package hex.types;

import hex.*;
import hex.content.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;
import mindustry.content.*;

import static mindustry.Vars.*;

public class Hex {

	protected static int _id;

	public static final int width = 27;
	public static final int height = 25;
	public static final Rand random = new Rand();

	public int x;
	public int y;
	public int cx;
	public int cy;

	public Human owner;
	public int id;

	public Seq<Button> buttons = new Seq<>();
	public HexBuild build;

	public HexEnv env;
	public byte door;

	public Hex(int x, int y) {
		this.x = x;
		this.y = y;

		cx = x + width / 2;
		cy = y + height / 2;

		env = HexEnv.titanium;
		door = (byte) random.nextLong();
		id = _id++;

		Schems.hex.floor(x, y);
		Schems.closed.floor(x, y);
	}

	public void build(HexBuild building) {
		building.build(this);
		build = building;
	}

	// TEMP TODO: move buttons to Type.build
	public void open() {
		Schems.door(door).airNet(x, y);
		env.build(this);

		clearButtons();
		buttons.add(new Button((h, x) -> {
			x.owner = h;
			x.build(HexBuilds.miner);
		}, this));

		neighbours().each(bour -> {
			if (bour.isClosed()) {
				bour.buttons.add(new Button((h, x) -> x.open(), bour));
			}
		});
	}

	public void clearButtons() {
		buttons.each(btn -> Buttons.unregister(btn));
		buttons.clear();
	}

	public Seq<Hex> neighbours() {
		return Main.hexes.copy().select(hex -> {
			return pos().within(hex.pos(), 210f) && world.tile((hex.cx + cx) / 2, (hex.cy + cy) / 2).block() == Blocks.air && hex != this;
		});
	}

	public Position pos() {
		return new Vec2(cx * tilesize, cy * tilesize);
	}

	public Point2 point() {
		return new Point2(cx, cy);
	}

	public boolean isEmpty() {
		return build == null;
	}

	public boolean isClosed() {
		return world.tile(cx, cy + 3).block() == Blocks.darkMetal;
	}

	public static boolean bounds(int x, int y) {
		return x + width <= world.width() && y + height <= world.height();
	}

	public enum HexEnv {
		empty(null, null),
		citadel(new Schem(), new Schem()),
		titanium(Schems.titaniumLr1, Schems.titaniumLr2),
		thorium(null, null),
		oil(null, null),
		spore(null, null);

		private Schem Lr1;
		private Schem Lr2;

		private HexEnv(Schem floor, Schem block) {
			Lr1 = floor;
			Lr2 = block;
		}

		// build terrain from schematics
		public void build(Hex hex) {
			Lr1.airNet(hex.x, hex.y);
			Lr1.floorNet(hex.x, hex.y);

			Lr2.each(st -> {
				Tile tile = world.tile(st.x + hex.x, st.y + hex.y);
				if (st.block instanceof OreBlock)
					tile.setFloorNet(tile.floor(), st.block.asFloor());
				else
					tile.setNet(st.block);
			});
		}
	}
}
