package hex.content;

import arc.struct.Seq;
import hex.types.HexSchematic;
import mindustry.game.Schematic.Stile;

public class HexSchematics {

    public static HexSchematic closed;
    public static HexSchematic hex, button, citadelMk1, citadelMk2, citadelMk3, baseMk1, baseMk2, baseMk3, minerMk1, minerMk2, minerMk3, thoryMk1, thoryMk2, citadelLr1, citadelLr2, baseLr1, baseLr2, titaniumLr1, titaniumLr2, thoriumLr1, thoriumLr2, sporeLr1, sporeLr2, oilLr1, oilLr2, waterLr1, waterLr2, cryoLr1, cryoLr2, forestLr1, forestLr2, compressor, oil, water, cryo, city, maze;
    private static HexSchematic[] doors;

    public static void load() {
        hex = new HexSchematic("DWQzQrCMBCEJwm0oq2H9M/GV7AnH0c8VOzJIqLvD+5kaEn5OrvfUrI4Y3Qo1vmxrD/4292hes7f1/SZ38s6XQFc7MUegTggP5VSrXSEg53cs3F4IvcK+/ZET5RWDoRXCkodx8tNGVjc2awnnJKnsjMlp0HpRESZUWaUGWVGmVFmI6WhTgSlTr1exfz3Vkqr4mgX80Ql1ETSQpJ6SQtJW88W8gc2DQx5");
        button = new HexSchematic(-2, -2, "C2OQQ7CQAhFP9C6mNilx5iV8TTGxRinG9Ga6v0jDATIC+FBwIyZcNB27/oFX2+M5dV/Teuq27bXC46Ptj/rp7271jOAkxWogJyclEHLAiZQNASGOMTCMJWxkhL7wMGBIXFKkpLEJQlJQpKUJn9DnJy0N+QPLwMNbg==");
        citadelMk1 = new HexSchematic(8, 7, "CWNwQ7DIAxDH6AiUA/dj+yLph0YY1IrBBPr/n8kUw52HNthZTX4mh6lfrC3u2N79ZHL9T36UfLZBzH3dqa9lUH4ttrTczK4gJmDQPxzhxPwOItlWWBzohr0GBAVK7qyoEwC6vDiYJbpFiRoJ2iPEUF9Ub79AB8YEbM=");
        citadelMk2 = new HexSchematic(5, 4, "FVRQW6DMBAcr8GAoSH5QT+QS79T9eBSV01FISIkVX7bh1RKd+xLI2RmmZ3d8S7YYWfgxvAaxxPk+aVBNVyHcZ4i6vM0zuEtLtgcP8Ip7od5usTrvKB/n5ch7o/L/BmHVYnyEs7jikYVazhMWtLlku8YLvrVHqaBdKDYfcVxVRJ4AgxKiNG4gohCXd1utx8N1sQ2elTTQiwENWwBPkpZuBLohZFPERMdtF8BBysKqdkvW1iyDSzttItThTYxFNLXofjv61QFQpuT3X3yAWCDHtZqswKG0MFUCoDUCiZDDyG5hbg0iiH0vIbPxv7e2Gdjn439vbGnMUcsOGTLu3MzasavBoY5XYDoq65ALSc3WpZWpY4bDk8ibQw8JRK09N3qX9DybS5/pG9iG8gfHutGbQ==");
        citadelMk3 = new HexSchematic(1, 0, "EVS7W7aQBCc8xmDHT4MMXb42QfgXfqzUlNVLrmEVg6OzEfUt+ob9WdfohKduU1UkJnbnWG8u7fYYOOQde230B2RfP5yg/Jl3x7D9rXtum3XDk8Bxf8MFo/9sAvbl6H/EXanfsDcyF1/uISfjKdv4tBewoCc+VP7/cBj9hy6E3F0ac/dCcvTPgzPbbd9CmRbWRX0Dsd9+9C/YrrjeXs477pwPgL4ygc5nGAO53gawwsm8AkSTC1ZWnIJDyYzJRNJBDm8JxRj2Cd1CucKf/H5ELUL05ZmsJSBR6qkxwieJ/roZGV43BpX6Q9imUzFCzKDlcGtSSq4jMwKbszKbgxoNmFHS5AZU8lGJ/xJcr4t1jtBjcTp3UhStaJacpkpecdaUYjzhGR8vV7v+fxhMOWXLC8WTmQtu/RtBAUaJBoe6xasZUe9CuZENdqZClHUGNypthklLmfVpVxm5LwGEl/8NzqPGHqDCnFatchPpDZ0WKhWEJz6L1W7YKb/LNiql4RdTZjMkGScDGeqqWWSaJROEPuvbN6VuBGBe6Ixz41bGRfvaW1XuY4XSMjUdh1bZRRve/2urAS1LU9ty1NzedjERz6/YxiXB2o6ihamjUvY2II2MgAhLm9jRTXvEu7pP4kkXHE=");
        baseMk1 = new HexSchematic(5, 4, "C1O7QqDMBBLq5tCseL/vYJPNPajqx0U/IBamXv7XbpxkECSyx0GDArX2T3DvEPfHxc0eT9Wt0T0b5dDGsOZk/N5S2j8tk5HzOh9+myv+YjTuMQzJJi4+riG5BgDboBCS+BogoXS0KigKqEammR+YoeKjobolUyhv2ghIHEu1CIqSLEAqadn2ErqUKokyVw51LGJZFCWxWXE8iV5iBcsk5Cqlr9YbtKTs18/qxyo");
        baseMk2 = new HexSchematic(5, 4, "C1Q0Y6DIBAcQZDTatMP8YsufaBKciZUDWrv7u+7gw0Jszs7u8yCG24FbPSPEDeo7/sXbJrWNQZ063/y+7SH/jn9hYRyPIYdzSP6bf9QzTQP0xxEtiS4Y46LH4U2L3/EHdX269NT8npYUui3H59GAD1QwPHiyVcHraCgUWiBEiA0J9kSmAuvKSG0yPKOypI1I2ANcC2sxA6KRJ0JKmRIJbw5oYY2sChZztGFkVhzNGQFDJQDT84avuCoYO/ZVkkk46wU5TVmeWr9maVzU0FoaeZyutOMsi3NzWS/7A2KK5XUt2wkmfduZUXF/5FfUvwmGrzSFzORsCaSN/FYJ5Q=");
        baseMk3 = new HexSchematic(4, 3, "FVSy27DIBAcsDGJ8EvJd+Tef6l6cF2qJrLsyHkpX9pbDr31HyqlO2C3ChjtDszOLouxxloh65pX3x2gn18WKPcfzcFv2qE/++swwrbXtht6j+p9GFu/2Y/DzrdHOXHbvt32fmwI8hh28c3Zj1ic+m5o3sQz5+bUHbEUvWNDNoAnWbD2fr+fZH1pQjfDm1bQWEJrJJyJIANNU0Bxs4JOxRgkNLkcII1yP1QK0P1DMjVDDOWMGGuASmXImIYbLmyQUUZ+DWVBgqZx1LTyiWYv6zshTC3lmUZELUzQoFcEj5QyUGSkAa5mgU+lmBqaFWTRyD24WTOXi7l2Uy73mMtNuax4GeQeucSByCEczwW4xwJcLGAXCkglKmGncrmzSqS3msHF1Bx6sSs8qtnVKvJLaY+MUjpO3Um/lI7/QZJyvlUlU65aS33yjjVfgKYgaRWfrOUfEKCb4Q2/M0V1XA==");
        minerMk1 = new HexSchematic(3, 4, "DWSyW6DQBBEa9i3YbGj/IW/KMqB2ByQMLYIWEq+Pl1TysF69FR19dAY7xgcsmX8mpZvRB+fObrnOh33cZ+vl9s2LwuGfd7HdT7ul+tjfU0/jw3FsS6P8TZtSF/jseyo5/U6r9M27qaW5ttHlqiex/KatvnXnoHZfsgROzgkAJGqyhCzLllF1GBIhdAQmwoiUhULiVAiJDo2JLQQiZDRktDCqtah52GqzFTtmdozRWecTmSqcqEQSqESaqERvNAKHZFrUK43yukkWkTOEoNWaAGF3qjQXkpppbRKVfVfeSEMqjSoQo84sgsBcWxjwrJq1kSjyjOgtr5w2CNKTAG1JnQaGmoNtYhjEHNj4WZeN/Pai9dePK9PZ4koNVQ22BAmeKbAnh2dbfiCBvtY3FHGCa2lhMOC01tNb9nn+FrUOjqJilrHOKITgrOXsw9/AENBZ29hjvBCWPkg56DMQZkD1+VwknZiSmoo2HcKq8RZ1z3zSzhDLQTtjc4/B5gr5Q==");
        minerMk2 = new HexSchematic(3, 4, "EWR4VKDMBCEjwAhQIFq9TF4FJ/A8Udso4NDoRMpjm/vbu6HdODj7ja7CZVnOWZiZ/8e5m8xr29O2tl/hzhe4jTPcrqh2vwy3a/jeV328LtG6dY9xI95/Rk//RbkxBLyPYy3uH6F8waNuy/z6i8hSrn7+7xJOy3naQnRc3r08brGcPn3FHkRyaTiI8eNq8BLTljJDd6czmqioISoqSylE5MBqVmqxGpl6UHAjigVVlEpnKJWNIqWqNSloksOIJhVK8YAB6Y76ZnuVOk0z1FCHOhS66zWWa2zRpuNNhs2CzyQU2KV4bpWla26tDhmQq8YJLdpCzDo8IPLAU24dGxmQKEoFVZRKdJOewQLK6wTOnJTA5SI7SFJGIhBqwEZGdEpekWSHCkxQDroQzqMPCLdEPhARk7Mq4BWMgsksyf+WUSlcIpage/0B7qDNIE=");
        minerMk3 = new HexSchematic(3, 3, "C2P3XKDIBSEVwgJiVrbSZ+hdz5RpxdE6QwdIilRp3n77pHcsOy35wfwjtcK++guPt6hPr+OqC/R3ed+zCFG1Lz7/DTnmyRuCsu1H9K0+kfK6Ib8SN9xCWN/DX8+w6xuiTPsMsXkRoI6TEOYfHYzy89p9ZnjVt/fcvrxg8A2hl8ZkNMyswH4ACpY6AoGe2iFHR1ETkwJW4GmQCNQsc4WebpaSg4FHgq0xVlxGkfu0DKRF8OjRrU1Q2uKhpYubhfITPNgZikK2lA22IjbU3ayr+FwJXIi5isb+cMLp1SKbstayRShLbK5rriu9L3JWhE+4x+1TzVD");
        thoryMk1 = new HexSchematic(5, 5, "CWPS3LDIBBEGzASEo7knCIrnSiVBZFZqIqAC0lO5fbpMSx4M9PdfHDDrNCl8B3TDv355eBT2GNd7nVLCX4vKdTlEXJMuD7KL5W9nHWNeD+2I+Tt/FnWkp/xr1QMrI6w5VjhzpxKuLOyz3CmA37LqyjhoBH4ABQstMBBK45GGMVuhNacjw7GwKCDuhC9dJbgZiUBKlexWkwvayci/4IJVFlzipdTS87CdOx6KMVtavdy9YSVvMPQMDZ4iQ94k8cN4rSElaFnVhvxQQkuDbaha1ov8A1XAXjUIJjEojHDOfnxLPcKeN4/22Ypeg==");
        thoryMk2 = new HexSchematic(5, 4, "CWPUW6DMBBEx5CAwUlFlDv0jxNVreQQf1A5GJkkVU/RI9MZopX1PLuzg8EJJ4Mq+kuIC4qPT4vDnH5C7pf0yEOAu0S/3PtrHmOEW1L0uZ/9FCLO6Rky+8/Qzzl9h+GeMs6z7H4aH7d+SNMz/LLpbn5Z+s2aYR9TTP7KmxunYZxC9loE3nlQWZQGBhZFQVRAwSLKrdgspXYsK+xfqASDGke6qTrGaGRraMyWKTjtFEcnCoNGyUrZwwjVCy1KwaGUc1totCBsqpXaEVafciC54SQr4gAGHvBWr+v6x/Nl1O30uqM8NYf0CJ1eepQStvCOg1KwLzT8XaKl/AfA4DgM");
        citadelLr1 = new HexSchematic(2, 3, "C2VSY7cMAxF5XmQZA2u6pwiQDY5TZBFJcgApBoNJH1/RJ/P3YtXtkR+iiJp98GdnZufj28/nv9c/+Xr6LbXx6/Xx9+373/c/O3x7/F8d8vvt3d7EV9/vD+eH38+397+fvzsXPfJtb/VdcIGdqFzixuEFWxgd73g3dC1XxOYwaK1Hmc9znoZ9A1eVr0LrheiMLjRDX3D5Dphdp1eLjIY8DLgZUB2wMvQvAxCBIe8jG1De2oewQgmMINFsqNOJANzPeJ6xPWoALUWeTowSIpsdFkGk0XQ0CvqSXp6GpW4qf235Qm9iaNMTc/WNnbuwLMzyPXU9AwHPhMGmZ1FmJ0DHejBAEx9tmgaTH1GfUZ9buq9sOtEc1O3tcBaxO4ACWRnN1vYUmWwEMTSguicXbdhUNSL5b5hAnabCzWxtCAMG152+VxaEGYeQAQHSCBTiAVUBa/zGDqKze595d5XSmpVECqhuR1XXFpJi+vF7eJ+0V8MO90QFefaYrH6T7jOoPDSYtmIZaNhlOKeTukEq8FNNaE6Jpbt0tjogU0lpl5JOMiYFJ5MY0fjakpVa99bEQ16GlmbaBI0dtPQ68jqARImWSna0djR8Gh4NDw5bT3OyxFMdCAa/tLwaHhy5WkVr1YRCqhCQCNwbwGNgEZAI6ARLo1waQTaMahAhQSyyi6oPYSqlxGNyDki9xHRiNLQ6LHaiJdGvDQiGpFpEtGInCNKQzCNA40DjQMNtU5zftgcajCNQxrG5eJ6cbu4X/QXFYu8RIQOFBLIoACLRYOiyapZBsGmQmIqJBoy0ZCJqZCshxtWXm5gBx4EEPF5YGdBJJKeSHpSEE5xKReZ0ZSZCpkgMg2ZNS+7hllbM0FkRlNmNGVVuHZ67AJeIjhYS6xlDAqoQkG9kAIbmX2DlVVhLBep6+WCgakXZlJRCrTFK9xCCgrqhbsuqBc+AwX1yuew0o6Vlq/oVfQqehW9SsorepUPaeWLVkl5pQYrelWn7dxJIk8SeZLIU4nUS3N9ahzpaWenuT5xfVJSJ7d5I8AbXm7yIpiXG15uBHjTMBDsO3XjO3Xn/u4U0Z0T3TG42/RwL6y9sPaitf/Oii2O");
        citadelLr2 = new HexSchematic();
        baseLr1 = new HexSchematic(1, 2, "DXWSXLbRhhAYVBDN9EYegBAKYfgKpUr5BIpL5iKkoVpy2X7/hWCn6yFXrFZ+N9DYyh2v3XboQvXy99v1x/dw1+fHrvhy/v159vX84/r5b9u/Ofy/fP52+Xr2/X8ezd9eft5uZ7/vb6/fz//0XWHP7vbX9/d/xIM+7+DxYPFw7546B66I/SQ4OO7ccdjFyDCEXpIMMDHARPMO566ZwgQ4Qg9JBhghAk+puQdz7epdzzBMwSIcIQeEgwwwgQzfIwuUPftCTYu3FbueNi/C+yBPbAH9sAe2AN7YA/sgT2wB/bAHtjDL3uDBdYdUVKUFCVFSVFSlBQlRUlRUpQUJUVJUVKUFCVFSVFSlBQlRUlxTzrcBh/gAR7hCW4t++0VIFo8+tRDgsF3o08TzBYzFKjQYHFXH+ABHuEJ7hG9DelF9DaktyG9DelF9DakF9GL6EX0InoRvYheRBKRRCQRSURyVZKIJCKJSHzJBUh8iS/xJb7El/gGvoFv4Bv4Bic98A18gzMaGAaGgWFgGBgGhpFhZBgZRoaRYWQYGUaGkWFkGBlGhpFhZJgYJoaJYWKYGCaGiWFimBgmholhYpgYJoaZYWaYGWaG2VWZGWaG2VWZXZXZVZn5Zr6Zb+ab+Wa+zJf5Ml/my84o82W+zJfditmtmN2KWUR20llEFpFFZBFZRBZRRBQRRUQRUUQUD2URUTyUxUNZPJRFRPFQFhFFRBFRRBQRRUTxgqheVrU7wL2laqlaqgtQbUjVUm1ItSHVhlQt1YZUV6VqqVqqlkpcvazqr5b7+7NJapKapCapSWqSmqQmqUlqkpqkJqlJapKapCapSWqSGn+T1Lw/F/aFfWFf2Bf2hX1hX9gX9oV9YV/YF/aFfXFxVqNXo1ejV6NXo1ejV6NXo1ejV6NXozdTNlM2UzZTNlM2UzZTNlM2U04OODng5ICTA077AV334qfKi58qL36/vFp8tfi6L/4PgIEudQ==");
        baseLr2 = new HexSchematic(1, 2, "C2QQQ7CIBBFp7WlWHVKp5jUQ7j1MsYFxq7EjXr/KD5J4OUzn/Bn5CD7SlxO1yW/pD5fKulv6Xk/PpZ3yiJy+m5Zy2/1YFOORjzYFrSoFuXwOamAB//aBGJBh7NDeV56rr3sgBLBASVJDVagAQGMwAoUp+JUnIpTcSrOgR8GfgioQJZAlkBtJPVIakMZ3RrdGt0a3RrOidpELaIiambIM0Oey5A/bBcMKg==");
        titaniumLr1 = new HexSchematic(2, 3, "DXUSW4jRxBA0aSGnLMmUuoz9RkML9pAA17I8EL3B8yql+ZCH8ViRjxSosKPcL+F+PXrr99f3+Hljz9fwvv337++foe3f/79/g7h9jM8HzlcjyL1/HELSbIUmffamecsiZIkS5Eq80CXceY1vMm7REmSpUiVJl3mlOXM23PqlVd5k3eJkiRLkSpNugyZo1fZzrw/3/2VF3mVN3mXKEmyFKnSpMuQRVaZ+/Yz0a8m2h5tj7ZH26Pt0Wuj7dH2aHu0PdoebY+2R9uj7dH2+P/240yCSBAJIkEkiASRIJIjCSJBJIgEkSASRIJIEAkiQSSI+beaITJEhsgQGSJDZIjsZIbIEBkiQ2SIDJEhMkSGyBDzm1IgCkSBKBAFokAUiAJRDCgQBaJAFIgCUSAKRIEoEBWiQlSIClEhKkSFqBAVokJUcypEhagQFaJCVIh6Is7/BMe1slE0ikbRKBpFo2gUjaJRNIpG0YxrFI2iUTSKRtEo2lR0ik7RKTpFp+gUnaJTdIpO0Sk6RTe1U3SKTtFPxe2ZvSrGwBgYA2NgDIyBMTAGxsAYGANjYAyMYfjAGBgDY0zGmIwFY8FYMBaMBWPBWDAWjAVjwVgwFowFY8FY7FhOxu2Zreo+y7FyrBwrx8qxcqwcK8fKsXKsHCvHyrFyrKfj9szy3HR2ra632X2WZCPZSDaSjWQj2Ug2ko1kI9lItnAN3UK7lm6hz+HD08t8ep0v22b3WZYdYofYIXaIHWKH2CF2iB1ih9gnYr8QZ8d8fpnX67zeZvfrYzysPaw9rD2sPaw9rD2sPaw9wjzepJ9Dj7n0mEuPufS4loZwN/5u/N34u/F34+/G38M80M7z9/mm7nP+/ZofwsOgh0EPgx4GPQx6+Hge8+N5zEmPa1IIH858OPPhzIczH+eZ5+PTzU83P8+b/wGVfiMK");
        titaniumLr2 = new HexSchematic(3, 3, "DWU7W7UMBBFJ87GdrJJnI8tb9EnQvxYpEpU2gKiRTwir8XcOaJSe2LH995xPK59srOz/Lh/fXm8W/r8pbf5x6+X54/Xj/v3199vNr1/uz9env/cHw9//ql38Wz213+tWhJG/emsaNQx2f2fnKwXrtZ3jkXvkmVNJhcEKpMhSAgSgoSgt4smextABgVUloxgkq53eYxmRu7SuUenBFn1wgUMIIMCqnQXeQphdpGZsIAVNK0c2OtgKjkcO+ECBpBBAdU6CSJhIGHwhHi3gBU0rcwkyCNGvcaZPWT2kJnO1JmpM1NnVp3CpnILX6IgL5JrsqiWQknFS4olUUuhlqJahE1FVD0LPQh5RVdJr6RX0ivpI4JRX00I3eiC6KQIGtn0xJJJ79QYB50UX/uK51We6pZ4N7uZ/8w00awmEmYQvTR7QixpTEZJkW2x12SxLhDNsLDDhboXt46VVzCDBcHKqLEyKluobOX8VhJWEvRxAnF+K+e3sofVYwMjmMAVzGBBvjJqyCN2JbYR24htxDZiG8ff+J6NFmukN9Ib6Y30RnojvZHelJ4ckeeNoe+5EbQRtHmQCQPIoIAKRjCBK5gtJccm692teiGu747njueO547njueO547njueO564jEDZNHpgdmB2YHZgdmB2YHZgdbtYJfmGTQ+dpJxf95KKfyE/kJ/IT+Ulj3riIN27SjQa78R/sicknnwxM1v0Dh7shpA==");
        thoriumLr1 = new HexSchematic(2, 3, "E3U23KbSABFUSxQowb6BpLnm+YbpvLgXB5S5Twl+f9xszRTUZW9JUGfs0Vfhr+G42UI72+fv73/HC7/fBqH8Pnt59v7ryF8ffvy/de3Yfzx++swvPw9fLxuw/mKsPR/L8MMN4jwvLZ2XIZrf38ZAsxwgwiLO58DNkgd4zDBmTJKGaWMUkYpY0/pWGHrGeN/Kbl/mj7+ToxwRk89uuOMnkRPoifRk+hJ9CR66tEdz+gipXZcP247cfEARpjgCsEtM5x9V31Xfdfe1+/cIEGGAs++1hFMTdAeevvH/GoP2oP24N6gPZi/oD1oD35t0B56e/+UoRhQ4dm+d8wk5i7R18cFRl+eEjOJ2SOfPfKZxGwRzSRmEjOJmcRMYu4SHdWABvsfa/VG4kbi1iU6JteuEHw5ww2ia8twrtXVlxskyFCgGtBg/2OnRBKRRCQRSUQS0XREDy+SiAIiiWgxRBKRRCQRScQu0dGM2//fpx0vcLFBR5jgCgFmd94gwimxkFhILCQWEguJhcRCYiGxklhJrCRWEiuJlcRKYiWxdol+LkRYYIXNnQkyFKiGNzglNhKb6dhIbCQ2EhuJrUv0c2iGG0RYYIXNgAQZClR9DU6JRCKRSCQSiUQi2R2JRCKRSCQSiUQikUgkEolEIpFIJBKJRCaRSWQSmUQmkUlkEtnuyBZmdk5kEplEtkWzUyo7pbJzIpPIJDKJQqKQKCQKiUKimI5CopAoJAqJQqKQKCQKieKHFlWFRCFRSFQS1cKsXaLjlKgkKolqYVYSlUQlUUlUEtVKq+a6mo5qOqrGSqKSaNqb9uaobNqb9qa9aW/am8XQtDe7rFkMzWJo2ptH0LQ37bu+Xd/uQNodSLu+Xd+ub3cW7M6UXd+ub9e369v17foO0Yfow1l32OGHY+YQfYg+HLiH6MODPMzmXcpdyl3KXcpdyl3KXcpdyl3Kw4CHAQ8DHgY8/KJX115de+3X/gWd5ySW");
        thoriumLr2 = new HexSchematic(2, 5, "DWSUW6DMBAFF2MwYGxst9fIiaJ+0BapkYgipaly/bAM/YARu/NsvCDvMlXSrvPnsv6KOX8Y8d/z1+WxnJ7zuoq/3ZfT4+d2v/xdReS8XdLqzfzDgU6kkloa0AIHjl6vsCgWxaJYFIvSUGwoNlrUTSswgBEEhaPndGlFCwZwKFHRsW0nHowgKHqKPcWe4qBLKwyogQcjOMyo8AQ8AU/AY3pMj7mfQFEBA2owggD2QCAQCAQCATNgRpSIElEi84zMc6I3aU82WDH61EqtcPQOc5980ldS7Gbi+yUGmQgkAolA5gwZM2NmzIyZ+dIFpaAU/qXCZArnfdNZK7biC3FfE0I=");
        sporeLr1 = new HexSchematic(2, 3, "DXUXW4bNxSA0bFlafjP4Uh2V5GFdA1FH1LUDwXSpogNdPsV5yh+yGdbGt4TkvLyy3J9Wi7fvv7x/u1jef7t99Py8vf3j48lffz7/cf7l+P7+vn1r38+3//88t/Xz/cfy/L063L/CsvxFSXNf56WVYJEebyWZ56Xs1xklSBRkjweKFJn7jw5y0VWCRIlzaEnq5yscvq5Spt5ua965CQvcpaLrBIkSpIsRao8lu6yzZzvkCPPcpIXOctFVgkSJUmWIlWa9Pm/Pf+cN2YujuYyp98PeU6fOcmLnL3lIqsEiZIkS5EqTbps8pi+z6wQqy1YIVaIFWKdiJmLrN4ZJPpl8lOWIlWat3Q/bTLkQDzuaoAIziE4h+Acgp0IdiJABE8GOxEgAkSACBABIkAEiAARIB6flAgRISJEhIgQESJCRIhogQgRISJEnIj5eWvS/XKTIQciQSSIBJEgkuNIjiM5jgSRIJLjSD5cCSJBJIgEkdzIBJEgEkSGyBAZIkNkO5EhMkSGyBAZIkNky2WIDJFdzGwnMkSGyBAFokAUiAJRIIrjKI6jQBSIAlHsaIEoVi3uRIEoEAWiQBSIClEhKkSFqBAVokJUiApR3YkKUSEqRLV4hagQFaJOxPyTeiAaRINoEM1HtLkTDaJBNIgG0SAaRINoEA2imdEm4vmeTYYciA7RIbq/Ex2iQ3R3okN0iA7RITpEh+gQHaJPxPM9XTYZss+lj82ZeZJjJzaIDWKD2FzMDWKD2CA2iA1im4jne6o06bLJkGMnhi0Ypg/Th+nD9GH6MH2YPkwfpg/Th+nD9GH6MH2YPtzI3bzd5dtdvt283bx9zpsJXouSJM/FdvN283bzdvN2+3u19NXSV0tfLX2dS89Eb0mS5Vj6aumrK3VzMW/uxM2G3ABvVrlZ5WaVmztxcydePfDqgVcPvHrg1QNvXnvz2tt87X9b+Cj4");
        sporeLr2 = new HexSchematic(2, 3, "E2U3U6EMBBGuwXaQgfodH98Cp/IeKFxL0w2atTEF/TBZHpc427gQOebb4aW4m7cfufC5eHxfPlw/u6+c9PH2+v7+fbt+eV8vf56uFxc+jy/PL0/bzLnvrfDJdd+I5jstHMRJDCC31i2k3eD3Xlinpi3mEHAbMrO9aAldEg6JB2SftM2dKAHA0hgBC2vtzxDscFhOxo86EAPBpDACAQ0l8FcDGqDgYcMeAbyAo8ZUAZTGuq/qYokRBIihSIJkYRIwu+EJxISfSb6TFbfEEECI5hABgJmUPBUUP+WzVZ2x10PBhBABAmMYAIZCJhBAfr3thh2vB8JjEBAm+SMMqPMKDPKjDKjFJSCUuha6FroWuhacBFcBBehT6FPoc+ZNZrxnM3TBgfuAogggREImEEBzXPBZcFloe8F5cJyLChXlCs7YEW50tSKckVZePZifRo86EAPWr1Cn4U+CytWmOZChUKFgmuhgmKtWCvWirVirVgr1soiK9aKtWKtWCvWFc/K/qssXOWhK1O3Z3BPocMVAUTQ9seBt/dA9SO77EjsSOx4jbXOTsROxE4W89s/uvapCq5de9CDJmkbyL5fEyh8xiJYDOWKalDMKi7VJsSwGvbWhGFL+AEqqB8/");
        oilLr1 = new HexSchematic(2, 3, "E3U227jNhRGYdmyjqR4kp0+U5+h6MUU04sC05vp9P1r6guKCYKsJCL3v0zureGX4bwN87cvf/z57Z/h/tvv4zD+/e/X4fH1r+8/hvHHl+/DcPt1eH+tw/W1wd5/3IYFVtjg81nouA8TzLDAChvs8Lkh9s334eh/jcMDJphh6evGXqVj888dAlxVxl6lI3U83qsvjHCVfvTS9zdmWGCFzZIdgn0RDvgsnaH0ldP71/f3JG+SN/W8fhwTzLDACpvtOwT7IhyQIEOB2jfMrmaWPkufe3o//gdMMMMCq5Ub7BAgwgEJMhSo0Hr6QmLpEh13tz7CAyaYYdFJK2ywQ4AIByTIUKBC+6lXVxIriZXESmIlsXaJ3sALrLDBDgEiHJAgQ4EK7adJ2bpEb/U7jPAwMBPMsMAKG+wQIMIBCTIUqND+n9OOm0G7w2hOHzBZMsMCK2yW7BAgenZAggzFkgqXRCARXEfQmIFEMIaBRCARSAQSwVEGEqGX6y+LCIdnCTIUqDZcEpFENB2RRCQRnUTUE1FjRtMRSUQSkUQkEUnELtGRIFtZoELr+y7ZjhvcYYSrMQ8SB4mDxEHiIHGQOFzHQeIgcZA4ukRHsaHCJZFIJBKJRCKRSCQSiURyHYlEIpFIJBJJYyYSiUQikbpER7XvksgkMolMIpuOTCKTyCQyiUwia8xMIpPIJLJjzj5oJpFJZBKZRNEThUQhUUgUEoVE0ZiFRDGihUQxZUWfFxKFRCFRfN4isZAoJKr0Kr1Kr9KrsajSqxdElV7dQ5VepVfp1QuiSq/Sq/RqLJq85t6bCWheSM0LqclrjrzJa/KaI2/ymrzmhdTkNe+CU+lT6VPp00GeSp9Kn0qfSp9Kn0qfSj9VearyVOWpylOVp554qvJU5anKyyd6OcGX+3vZ8LLhw7MPzz76s/8ASWkixQ==");
        oilLr2 = new HexSchematic(2, 3, "DXQSw7CIBSF4dsWaNFWHnUb7sCdGAc1OjBhpCZu33L/2oR+4RwIATnK3Igry+1R3tJero34+/P1OX2XUkTkvA4ZRD8Pu/prpIcBPGzdvtKKBQc9DOBBN3RiwIID3WDoDJ1dYyVVnASIsIW50ssBAkRIkLlWhAQajpw3ct7EeRPhYb2a0kIH2gUeJ7AksCSwJNJFukgX6RJhIkyEmVn+zwxY0OeZCeca/gDstQsD");
        waterLr1 = new HexSchematic(2, 3, "DXVXY7iRgBFYYPBxmXXnw2dVfRTVpE1RHkgmpYiBU2i6Uiz/VD+aB44jU3de6gqV3e/dNuhGx73Pz8en93x9z9O3enz/v1bt3y7//j7/d/794/H+69daNfef97/+/jRxc+/7o/HPz9fH7vDb93zdXn+8cTU7a/Q3g7dCPu9g3uHr3tzw7E7w9AuHQ04GnBsAxqCi68BC8SGvjvBGQYYYU/p1fZSeim9lP4rJTWcnqk7ejjBGQYY4QJTMzm16IbZxQUivKIzlIbzPlNPHKGHE5xhgNEcXWCCALOvLBAhQYZXX20zMZj3QfugfdA+aB+0D+27bU1GuMAEAWZYDIiQIEOBCmvD+LUxDnB0sYcTnLt9KwwwWtILTC4GmGGBCElKhgIVdol99RoOcIQeTnbgGQYYbagLTBDcm2GBCAmyzAIVdonXkzKRmEhMJCYSU5NoG3iAES4wQYDZgAUiJMgyC1TYJQKJQCKQCCQCiUAikAgkAolAIpAIJAKJQCKQCCQCiUAikJhJzCRmEjOJmcRsOWYSM4mZxExiJjG3uIbFgAhJWIYCFXaJhcRCYiGxNIl25JzgDAOMDpILTBBghgWiAUlmhgIVdolIIpKIJCKJSCKSiCSiRzSSiCQiiUgikogkIolIIpKIJCKJRCKRSCQSiUQikUgkEonknEgkEolkTyTLkUgkHYlEIpFIJBKZRCaRSWR7IpPIJDKJTCKTyM6J7BHNJLJFzqY5k8it6vB8Kz5V2CUKiUKikCgkisOqODELiUKikCgkiqes2OeFRCFRSBS/t2gszutComqv2qv2qr1qr872qr1qr06Yqr1qr9qr9urZrK29obi4T8Gqb9W36lv1rfpWp/nqPF31rfpWfau+1bqv+lZ9q75N9CZ6E72J3vwP30RvojerudlSm+jNRF6lXKVcpVwJXi3H1Z64SrlKuZqQmwE3tTcDbgbc/KI3994ovbV7/wNE5C3a");
        waterLr2 = new HexSchematic(2, 3, "DWS23KDIBRFD6CmmBEOeOlX5Is6fbCTPNX0oem0v19hRWdkje4LCMqrjEa6bf24bQ+xb+9W/GP9ul7+1m2T/rp+f17ut591E5Hf/ZYXEbPDS736Mhg5gaoZNHNo5zJYLBaLLZaCnpfnAofmiDs0h9YUrcCDqrV1ITss8OCppVLWsYQOZ4ez21srGuCBggRywen4OgMsLx1oQAs8iEBBAvm5ccCxVQ1PLehAABEoqC0ep8fpZQAB1MBA54BzwDJgCSw+sPiAM+AMOMPhjKDOHll1ZAcjLZGWSEvk2yPxWCJmH57xBOoWKGVKmVKmlCktyoyKVzlGJZ7IJXKJQOLAE7lELjFtxpnZ+0wgE8g4R/66EW1Emzj5idyENqHNaDO5GW0+tPq3LmgL2lK0f3WGFI8=");
        cryoLr1 = new HexSchematic(2, 3, "E2Ua27UMBhFnfhtJ/EjmbKKLoQ1IH6UtkiVRgyiIMTumc9nBlGpOU0c33uaOFYf1D4pd3768np+V/Onz1bpt+dXFa6Hx/dvl9+qfr9czq8vj88//ly+nn+9vSgzrpv3p/NPpaaP6voT1PiJIMlhUh4EEOUw3ceyYFYWOODlMMsEQQSJsduERSbPahVoZeSiJkWToknRpGhStKQIMrcsYAWbGlGzZJrrnwMGjGhDtOE/MkQbog3RRqIFC/NW7txAAVXG7PV3OM9Ac9GA0Wfps/RZ+ix9lj5Ln5U+wQo2JhRQQfvv4TjaHe1O2gUGWJFw3Otod7w/R7uj3dHuaHe0O2kXFCZU0EC/vRowgZllojkzwALH2JjikfAsMM+a8Eh4JDwSHgkvEoLKnQ0MiYBEQCLwJAISgfcQkAgiIfC89cBSjyCBDBYwJAISAYmAREAiIBGRiEhEJCISkScRkYgiIYvNgwAiSHx2GSxgBUMiIhGRiEhEJBISCYmEREIiIZFEQta4Ax4EEEECGYwvICGRWJGJNZFEQr7oxtmQuH2SGYmMREYiI5GRyEhkJDISGYmMRJY4mbCAlb1mA0Mi8yQyEhmJ5b4vTGAGGhg1PmwLHPAggMidCWTpW5BYREKwcbGAIbEgsYjEvz1jRWIVCTnTwAALHPAgMCGCBDJYwAo2UMDYkFYkViS2+8Y1gRloYIAFDngQ2EsjSCCDBYzXsSGxIbEhsSGxIVHu2+YEZqCBARY44CWsIFGQKEgUJAoShSdRkCi8jiISctY467fdGkxgBhqMhVn5RCv7REWiIlGRqEhUJCoSFYmKROVJVCQq+3VFotHeWJGNFdlob7Q32hvtjfZGe6O90d5ob7Q32hvtjfZGe6ev09fp6/R1+jp9nb5OX6ev09fp6/R1+jp9nb6d6J3oneid6J3oneid6J3oneid6J3og5SDlIOUg5SDlIOUg5SDlIOUExNOTDgx4cSEExMeGHtg7EHG/gJOXC7P");
        cryoLr2 = new HexSchematic(2, 3, "E3R7W6CMBTG8UNbhLYovgx3FV7RsiVs4QMJ02W6ePs7p/+ZzKg/6vP0BZFnOVSyWsb3abmKe3mtpZ0/ptN9XBaJ13G5PS7Pl/v/y6/5PEl3+Z5Ot/k2nuefTxF5049EKa9kX142Ri0N7IyV7I2GZsOolSxS6awWNHNKZ2tk/UXfmayzxSpZQ1nf8BCgNnqynum9LljwEGyH3s5pZNuot/0q2TJvy7ytzXNKggylubOKUyIkyNAZezu1ESFBqRz0vyg00EKEZEc66I3q6MnuyFhBAy1ESJCh7D7QHGgONAeaA80j2ZHsaFkoD0SpbLrxN4qQIBuOiqPiqDgq7lHpYG14mp6mp+lpepqeZiALZIEsPLKNUZPVZDVZY08+6Pr6IH8BOEQfCg==");
        forestLr1 = new HexSchematic(2, 3, "DXVa27bRhSAUVqP4cxwHpQsuavoQrKGID8cJGgLuAhgJ8j2q+FhBcMfDGruPRZIaPpjen6awtvr1+9vH9Ph85fTdP7r/fXjY6off7++vf34/efv15/f36fTt3/ef07Hf399m6anT9PjFaftlSSPX0/TLFGS7NeWkcN0liCzREmSZT9QpI4cp5OcJcgsUZJkWaTIPqWNnB5TtxzlJGcJMkuUJFkWKVJlH91lHTk//vvHz3nsGznKSc7eEmSWKEmyLFKkSpMu+77LSPC5B9uD7cH2YHuwPXhvsD3YHmwPtgfbg+3B9mB7sD3YHv7ffh3Z74gZYoaYIWaIeSBGggOzREmSZZEiVZp0WeUiG2K/HyNEhIgQESL6JCJEhIhORogIESEiRISIEBEiQkSICLE/DQkiQSSI5OZLEAkiQSSIZECCSBAJIkEkiASRIBJEgtifxQyRIbInIENkiAyRITJEhsjmZIgMkSEyRIbIEBkiQ2ynRp7kIEc5yVmCzBIlSZZFilRp0mWVi2yIAlEgCkSBKBAFokAUiAJRIApEgSimFogCUSAKRIEoEBWiQlSIClEhKkSFqBAVokJUiApRIarhFaJCVIgKUSEaRINoEA2iQTSIBtEgGkSDaBANokE0iGZHg2gQDaJBdIgO0SE6RIfoEB2iQ3SIDtEhOkSH6BAdolvVITpEh1ghVogVYoVYIVaIdSAOj8wSJUmWxTuLVGnSZZWLbIiL7RfbL7ZfbL+M7YdHgswSJUmWxYEiVZp0WWXbfrXvat917Ds8cpYgs8TxHXod+0ayLFIcr9Kky7bv2ejnMfr4SJBZomvJX1kWKY5X2UbfTLmZcjPlBngz5WbKzZSbKbcx5TDdHbg7cHfg7sDdgRfXXlx7Gdf+A/RKKGQ=");
        forestLr2 = new HexSchematic(2, 3, "E2Sa2rcMBhFv5EljZ962E67iq6o5EdCAgkMpWRauo+uOL46M5AB+yD53iOPZPtu28ni5en59XI19/Oxs3h9+/j7fDX/+/3Xqw0v7x9/fvx7ulzM7P9xWW/tN4BRt5OdQQ8GMOrmLICoSUfSkXRKnqwzDwJoyY5kp6QmZ0ZJI380GzrgQVDEU/fUPQt5W0ACGRT1wnE1ONABD5oz4Aw4A86AM+AMcqpwc1Yhsg+RFSIrRJyRp1FOTQ6MEshMFnCTrV92+iynHYjgDDIoRCpYvxxNz7v0bGRPpFfE7sc2oB7vB3wbOWFiNPFXEpHEZLpPejCCCcxEKmivlFkvU8+skDmATD1Tz6oLCyigUmiygqwgK8iKZO7ACCYiM1hAAhkUUKk3dcVZcVY5BS9nlVOYSS4ggUyygLbXK5aVN1uxrPomhAnMRBaQQAZFkY3eRm/TVyDMoPU29ZztRHYiOyvsJHclnT3o5IURtMg3fTHCAI5nn5sxF3g=");
        compressor = new HexSchematic(4, 7, "FWOy3KEIBBFLygPpay8/yBbvyiVBaMsqEKdgE5N/j7dkiyyaA59+/YDrxgEdPKXkArkx2cHl3wJeZxzTAnuQtn+m7xcOfFrPJZx2tZb+N4y3OJLYcMtZAxbTGO479lPO9Xe/jUs1xxK4Za4TnEN2bNnSPHriPOYt2OnCfZY0+Zn+gHvgIDip6GAJLSM9g+2GnrOVBUVdIVBw7AMXWu61jSJUpLhFE0VDYsNOihDmzsKCEnaae0qegbg6kLHWYuBlkhFkBAMA6HxwD5FoMMNQdVM1xqdbfHIXeilpp+CYMGegsITz2rwXG+5U7hTpdE/3HI3yw==");
        oil = new HexSchematic(5, 5, "E2PXW6DMBCEF0P4MSahB+Gtt6n64BKkoPJXYh56t16iJ6IzbCIVCYaZ/Xa9lhepI0kH/9ENdzFv71ZcuHXr6Idm2cZFsnaerlsf5DJ27c1Pffus1EP/tfXXBkDw/dStUi03f++aZ0e5zsGv30qXDzr46RPgNvwH+6nlAB9mDHmA67wFzBR5FYkk4yeSRMRAToglpovhrZgIP6kgiKUAKo4AsATw0YZiCl8wPIGKOCRVyVRKiSlOpZKYAJ4MYjglRWhieKMbJezLwB6CYayhmuBzbJEfW7BYsafAEdg0V2fRCFfAH1JRrK5mGQrwsxjDxRiWSpacwtARqbTmdAunV3J6JceGHDNynn3m5eks3YVhAimyfd9/8f4cqSVTa0etHTXDP50OQWo=");
        water = new HexSchematic(4, 3, "FVQbZKbMBQTeEn4DPmYHoMr9CKd/mCJd+NZE6hjMpuevhLZdqYTwkNPetKzccIpwcb3r9bfkP74eUI5L/5ug/ttAzaj9ZH12+z7W+yvbhm7YRrnYG+3KaBy18FdbeijwLj46LqVw+m/gevdPqjYvYd+vrhov0TN5HxnP2PoBxm0w9T7brDXGNzb8m6x9+7X4s4yiL1ysOXneXER5aCw+xpcx4sNI0fnZZzRjna4MHj41xjCY3rzMhrdJ02qL1uu94GGp73Z7q9v9aq9u3Nw3qMKU+zD42kDfOcfGZKEZYMkZamRGiR4QcqHTUMaO+lS/thIYWC2fFGZEZHLWVrK2MzlZ9SUB2cNC4cKlq3MXsSptDAlP1YuQyVlhkZcJkmlhWBqTtGzISphDBHUzMlTtcUBNCqoTBs2N0/UguJCe+6hYCOUaa6UQUJUPCUNEpWD0gsckdQ0LpE0fNVKKJVQKU3plU5fkOG9NNAaRrpaJ2+YQLnWWI1LpUu0NhuYA/fihZV0zbHeUS2znbiSXC7UMsMcoUkm7InTI1eohI5spn8AL3xuHQ==");
        cryo = new HexSchematic(2, 4, "D1Qa26DMBgzhAYK4dHtHD3AzjLtR0aZisajoyCth586G7r9IMaOP8cJnnEIYDv/3nRXhK9vKbJ2qNuhmfw8TsgvZ39tjvU4nJZ2RjaNs59ux8vSXxD/qVXXfi3tSa7ZaxRuPjdT77vNWPZNffZDW/8L9XQbPzrN9O03/fkjYRqXmTR70NkPnwBe+CHWwqpaAsSiRpIJSRMYqelqut/vP1RDeo0hpAgjQgazQ4S9xEhxlpAhEHMIBTlMRChk2cmyo8npHMt0CpY5HLDaUz7DLGEdsCiVYlHBxGtdOuMtJeGeSQihUthWewl/gwiSjSDTMYlKxAwOZNmzPAS5SqRaDGEVsw2cThAkKuG2+7nN6zjHbceCDMvljAlOrBBLCIXEggUplpulpIn3rVjX7HHgk7Bntd6eUILCgQayJz3yL9LsP5o=");
        city = new HexSchematic(3, 5, "GVPW27DIBAcIAHHVHYf5/CJqn5QQmMkMNaaqs1fD9LDdslXVGsFw87ODIAXPAro5N5D2iBf33qMOXoq00rFh20rhDGVS/R3hM0hF7pOPqQEk5l0l4Bxvq6B7mR6+4rVz7Au0vThfGUPHiisrV9LXCrGOheKn3micJtj8CVnt5w5e6mBADzxwmngzX7/+vOPBJ4hIbi6/6xsfA/RwEIo1pmDaAF8srsMCQUDHLh2F8gjs6Zv5uPeKjQbRRsKYdBBQ0kG5lrXQXX8DAOlGYabTJ34J3qE+gNh+ENA");
        maze = new HexSchematic(5, 3, "E2QP2gUQRTG3+xedi+7t7vJKYLVRW1icSIpjSBRixReEYuASAiT2bm7MbM7m/2jd0TwyDUpJCAH4cCUamNhmoggqKSzkWAhCFqISFAICrHVy9uAkuLxm/e9N+99M1CGYwQMSRe4TEC7OVcGW4RMhDymqYrBTiIV82oU8yTBREkaVyMacgnFLJSK+jwGl6kgoKFfZTxM8zySNOWYqtDPRAoei9uqLjPhVwPRwgYnatKE/69bLJOpuH24z4kyeaRkJHdEyprgBZw1aSgYldUoCyIwAzREGxw8qRqCoUHFUMEJXiBYrI4I5r9hdsADFbfRppTgNmKVoec6Zbi3DQAnMMAFnQBBEA0MKIOmgwlDQAoIw8tVEyzQhxA2EAMxApqJKJuDweABxpZWhCL2kGEEDrDwrFmE2EhMS3gPCgRAd/IJLu5cbW3U1qbc7fOlgmO6o3+68533V35eXPH6C2PjW93e6qVf8y/WT1+dWr6xtzb7EjrL9be3pruzZ/v3k3Dp6akLtdbEk+3nk70xe+9M5ZW/O/fs+rWvnwrfu5szM4u7O6+/ncume18WH1fuPep//Dx+/PfDdzW1vvm3crKy8+bHvrh7eV/7MDy5orloSc8t2a0N5nc0yB0TD9XDh5QALKKPIHXQPASqNjg5RvEfSvgqIPoBxtmm6w==");

        String[] base = {
                "C2OQQ4CIQxFf4vDjBM9gWdgZTyNcYERN1bHjN4/9hch4f08aAu2SIJs9drsAz1fFPtn+1Yrd1uWtZywu9X1Ud711awcARzANUPFIawGFIm529g8lFC/TpH5RqEzeuxgtcOtpw07JFL+1OAQXpzCAUM0RaZ1k1lKxLyxdx5jvkPjT1O3U3zOQfsDVV4NqA==",
                "C2LTQ5CIQyEpy2gIbrzGqyMpzEuMOJG9Jmn949MkYZ+zfwgYStIvV5b/0DPF8XuVtdHeddX6+WI/bN9ay/3vixrOQE4jI8EfxtAxoQMIWOGUnFX6GIINhEoqWfI5B2D/KnetZk2pjEXIewGz5CWqcTpRt4/nxoNUQ==",
                "EWLQQrCMBBFXzJJlKI7r5GVeBpxETFujFZq708zSanD8B9vmE9gbwgl3XP5Ya83y+GRplf8pk8u8czxnedU4rOM4xQvwIn/mC0UpocdsEoZkGqYlXqnrui3xSmkm6jVBr51hdA6DrfSt64j6Ldjp/DdvNoClHINWQ=="
        };

        doors = new HexSchematic[] {
                new HexSchematic(9, 22, base[0]),
                new HexSchematic(20, 14, base[1]),
                new HexSchematic(20, 3, base[2]),
                new HexSchematic(9, 0, base[0]),
                new HexSchematic(1, 3, base[1]),
                new HexSchematic(1, 14, base[2])
        };

        closed = door((byte) -1);
    }

    public static HexSchematic door(byte opened) {
        Seq<Stile> tiles = new Seq<>();

        for (int i = 0; i < doors.length; i++)
            if ((1 << i & opened) == 1 << i) tiles.addAll(doors[i].tiles);

        return new HexSchematic(tiles);
    }
}
