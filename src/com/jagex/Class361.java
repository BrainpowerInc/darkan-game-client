package com.jagex;

public class Class361 {

    static int anInt4185;

    public static Class361 aClass361_4174 = new Class361(9);

    public static Class361 aClass361_4170 = new Class361(3);

    public static Class361 aClass361_4171 = new Class361(7);

    public static Class361 aClass361_4182 = new Class361(8);

    public static Class361 aClass361_4173 = new Class361(10);

    public static Class361 aClass361_4178 = new Class361(4);

    public static Class361 aClass361_4175 = new Class361(15);

    public static Class361 aClass361_4177 = new Class361(1);

    public static Class361 aClass361_4169 = new Class361(5);

    public static Class361 aClass361_4176 = new Class361(11);

    public static Class361 aClass361_4179 = new Class361(13);

    public static Class361 aClass361_4180 = new Class361(6);

    public static Class361 aClass361_4181 = new Class361(2);

    public static Class361 aClass361_4172 = new Class361(12);

    public static Class361 aClass361_4183 = new Class361(14);

    int anInt4184;

    public String method6253(byte b_1) {
        return "_" + this.anInt4184;
    }

    public Object method6254(Object[] arr_1, byte b_2) throws Throwable {
        return Class441.method7375(IFSubNode.anApplet8065, this.method6253((byte) -103), arr_1, -864782771);
    }

    public Object method6255() throws Throwable {
        return Class441.method7377(IFSubNode.anApplet8065, this.method6253((byte) -29), 2107704152);
    }

    public void method6256(Object[] arr_1) {
        try {
            this.method6254(arr_1, (byte) 14);
        } catch (Throwable throwable_4) {
        }
    }

    public void method6257(int i_1) {
        try {
            this.method6255();
        } catch (Throwable throwable_3) {
        }
    }

    Class361(int i_1) {
        this.anInt4184 = i_1;
    }

    static void method6269(CacheableNode_Sub7 class282_sub50_sub7_0) {
        if (class282_sub50_sub7_0 != null) {
            Class20.aClass482_171.append(class282_sub50_sub7_0);
            ++Class20.anInt169;
            Object obj_2 = null;
            CacheableNode_Sub15 class282_sub50_sub15_3;
            if (!class282_sub50_sub7_0.aBool9586 && !"".equals(class282_sub50_sub7_0.aString9588)) {
                long long_4 = class282_sub50_sub7_0.aLong9580;
                for (class282_sub50_sub15_3 = (CacheableNode_Sub15) Class20.aClass465_172.get(long_4); class282_sub50_sub15_3 != null && !class282_sub50_sub15_3.aString9771.equals(class282_sub50_sub7_0.aString9588); class282_sub50_sub15_3 = (CacheableNode_Sub15) Class20.aClass465_172.method7747(-2120595653)) {
                }
                if (class282_sub50_sub15_3 == null) {
                    class282_sub50_sub15_3 = (CacheableNode_Sub15) Class20.aClass229_164.get(long_4);
                    if (class282_sub50_sub15_3 != null && !class282_sub50_sub15_3.aString9771.equals(class282_sub50_sub7_0.aString9588)) {
                        class282_sub50_sub15_3 = null;
                    }
                    if (class282_sub50_sub15_3 == null) {
                        class282_sub50_sub15_3 = new CacheableNode_Sub15(class282_sub50_sub7_0.aString9588);
                    }
                    Class20.aClass465_172.put(class282_sub50_sub15_3, long_4);
                    ++Class20.anInt170;
                }
            } else {
                class282_sub50_sub15_3 = new CacheableNode_Sub15(class282_sub50_sub7_0.aString9588);
                ++Class20.anInt170;
            }
            if (class282_sub50_sub15_3.method15245(class282_sub50_sub7_0)) {
                Class13.method503(class282_sub50_sub15_3, 1768390484);
            }
        }
    }

    static void method6270(byte b_0) {
        if (QuickChatValueType.method4180(client.gameState)) {
            if (client.LOBBY_CONNECTION_CONTEXT.getConnection() == null) {
                Class365.setGameState(14);
            } else {
                Class365.setGameState(0);
            }
        } else if (client.gameState != 14 && client.gameState != 19) {
            if (client.gameState == 12) {
                Class365.setGameState(5);
            }
        } else {
            Class365.setGameState(5);
        }
    }

    public static byte[] getWhirlpool(byte[] bytes_0, int i_1, int i_2) {
        byte[] bytes_3;
        if (i_1 > 0) {
            bytes_3 = new byte[i_2];
            for (int i_4 = 0; i_4 < i_2; i_4++) {
                bytes_3[i_4] = bytes_0[i_4 + i_1];
            }
        } else {
            bytes_3 = bytes_0;
        }
        Whirlpool whirlpool_6 = new Whirlpool();
        whirlpool_6.method7406();
        whirlpool_6.method7407(bytes_3, i_2 * 8);
        byte[] bytes_5 = new byte[64];
        whirlpool_6.method7408(bytes_5);
        return bytes_5;
    }

    static final void method6274(Transform_Sub1 class521_sub1_0, int i_1, int i_2) {
        FontRenderer_Sub3.method14336(class521_sub1_0, i_1, false, 1466733584);
    }
}
