package com.jagex;

import java.awt.*;

class Class109_Sub1 extends Class109 {

    static int CAM_MOVE_ABSOLUTEZ;

    static void method14650(int i_0) {
        for (Node node_2 = client.ICOMPONENT_SETTINGS_SLOTS.method7750(); node_2 != null; node_2 = client.ICOMPONENT_SETTINGS_SLOTS.method7751()) {
            if (i_0 == (node_2.pointer >> 48 & 0xffffL)) {
                node_2.unlink();
            }
        }

    }

    public static int method14651() {
        return 12;
    }

    public static AbstractRenderer method14652(Canvas canvas_0, ImageLoader interface22_1, int i_2, int i_3) {
        return new HardwareRenderer(canvas_0, interface22_1, i_2, i_3);
    }

    @Override
    void method1851() {
        Class260.aClass277_3221 = Class260.aClass277_3234;
        Class260.aClass277_3234 = null;
    }

    @Override
    void method1849() {
        Class260.aClass277_3221 = Class260.aClass277_3234;
        Class260.aClass277_3234 = null;
    }

    @Override
    void method1850() {
        Class260.aClass277_3221 = Class260.aClass277_3234;
        Class260.aClass277_3234 = null;
    }

}
