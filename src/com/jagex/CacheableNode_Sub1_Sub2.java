package com.jagex;

import java.lang.ref.SoftReference;

public class CacheableNode_Sub1_Sub2 extends CacheableNode_Sub1 {

    SoftReference aSoftReference10403;

    boolean method14694() {
        return true;
    }

    Object method14692() {
        return this.aSoftReference10403.get();
    }

    boolean method14691(int i_1) {
        return true;
    }

    Object method14693() {
        return this.aSoftReference10403.get();
    }

    CacheableNode_Sub1_Sub2(Object object_1, int i_2) {
        super(i_2);
        this.aSoftReference10403 = new SoftReference(object_1);
    }

}
