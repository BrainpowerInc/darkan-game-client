package com.jagex;

public class Transform_Sub1_Sub1_Sub1 extends Transform_Sub1_Sub1 {

    MeshRasterizer aMeshRasterizer_10310;
    HintTrail aClass281_10311;

    boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
        return false;
    }

    boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
        return false;
    }

    boolean method12985(int i_1) {
        return false;
    }

    boolean method12986(int i_1) {
        return this.aMeshRasterizer_10310 == null || !this.aMeshRasterizer_10310.u();
    }

    boolean method12987(int i_1) {
        return this.aMeshRasterizer_10310 != null && this.aMeshRasterizer_10310.i();
    }

    void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
    }

    void method12984(int i_1) {
    }

    Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
        if (this.aMeshRasterizer_10310 == null) {
            this.aMeshRasterizer_10310 = this.aClass281_10311.getMeshRasterizer(graphicalrenderer_1);
        }

        if (this.aMeshRasterizer_10310 != null) {
            Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_4 = this.method11168();
            Position class305_5 = this.method11166();
            matrix44var_3.method5209(matrix44var_4);
            Class293 class293_6 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_5.coords.x >> 9][(int) class305_5.coords.z >> 9];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
                matrix44var_3.method5219(0.0F, (float) (-class293_6.aTransform_Sub1_Sub3_3499.aShort9561), 0.0F);
            }

            this.aMeshRasterizer_10310.method11282(matrix44var_3, null, 0);
        }

        return null;
    }

    boolean method13001() {
        return this.aMeshRasterizer_10310 != null && this.aMeshRasterizer_10310.i();
    }

    public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
        return null;
    }

    public int method12995(int i_1) {
        return this.aMeshRasterizer_10310 != null ? this.aMeshRasterizer_10310.YA() : 0;
    }

    boolean method12999() {
        return this.aMeshRasterizer_10310 == null || !this.aMeshRasterizer_10310.u();
    }

    void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
    }

    void method13023(GraphicalRenderer graphicalrenderer_1) {
    }

    boolean method13002() {
        return this.aMeshRasterizer_10310 != null && this.aMeshRasterizer_10310.i();
    }

    public int method13003() {
        return this.aMeshRasterizer_10310 != null ? this.aMeshRasterizer_10310.YA() : 0;
    }

    public int method13017() {
        return this.aMeshRasterizer_10310 != null ? this.aMeshRasterizer_10310.YA() : 0;
    }

    public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
        return null;
    }

    public int method13006() {
        return this.aMeshRasterizer_10310 != null ? this.aMeshRasterizer_10310.YA() : 0;
    }

    Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
        if (this.aMeshRasterizer_10310 == null) {
            this.aMeshRasterizer_10310 = this.aClass281_10311.getMeshRasterizer(graphicalrenderer_1);
        }

        if (this.aMeshRasterizer_10310 != null) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_3 = this.method11168();
            Position class305_4 = this.method11166();
            matrix44var_2.method5209(matrix44var_3);
            Class293 class293_5 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_5 != null && class293_5.aTransform_Sub1_Sub3_3499 != null) {
                matrix44var_2.method5219(0.0F, (float) (-class293_5.aTransform_Sub1_Sub3_3499.aShort9561), 0.0F);
            }

            this.aMeshRasterizer_10310.method11282(matrix44var_2, null, 0);
        }

        return null;
    }

    public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
        return null;
    }

    Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
        if (this.aMeshRasterizer_10310 == null) {
            this.aMeshRasterizer_10310 = this.aClass281_10311.getMeshRasterizer(graphicalrenderer_1);
        }

        if (this.aMeshRasterizer_10310 != null) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_3 = this.method11168();
            Position class305_4 = this.method11166();
            matrix44var_2.method5209(matrix44var_3);
            Class293 class293_5 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_5 != null && class293_5.aTransform_Sub1_Sub3_3499 != null) {
                matrix44var_2.method5219(0.0F, (float) (-class293_5.aTransform_Sub1_Sub3_3499.aShort9561), 0.0F);
            }

            this.aMeshRasterizer_10310.method11282(matrix44var_2, null, 0);
        }

        return null;
    }

    void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
    }

    public int method13005() {
        return this.aMeshRasterizer_10310 != null ? this.aMeshRasterizer_10310.YA() : 0;
    }

    boolean method13026() {
        return false;
    }

    boolean method13011() {
        return false;
    }

    Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
        if (this.aMeshRasterizer_10310 == null) {
            this.aMeshRasterizer_10310 = this.aClass281_10311.getMeshRasterizer(graphicalrenderer_1);
        }

        if (this.aMeshRasterizer_10310 != null) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_3 = this.method11168();
            Position class305_4 = this.method11166();
            matrix44var_2.method5209(matrix44var_3);
            Class293 class293_5 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_5 != null && class293_5.aTransform_Sub1_Sub3_3499 != null) {
                matrix44var_2.method5219(0.0F, (float) (-class293_5.aTransform_Sub1_Sub3_3499.aShort9561), 0.0F);
            }

            this.aMeshRasterizer_10310.method11282(matrix44var_2, null, 0);
        }

        return null;
    }

    void method13012(GraphicalRenderer graphicalrenderer_1) {
    }

    public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
        return null;
    }

    boolean method13000() {
        return this.aMeshRasterizer_10310 != null && this.aMeshRasterizer_10310.i();
    }

    Transform_Sub1_Sub1_Sub1(SceneObjectManager sceneobjectmanager_1, HintTrail class281_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        super(sceneobjectmanager_1, i_3, i_4, i_5, i_6, i_7, i_5 >> 9, i_5 >> 9, i_7 >> 9, i_7 >> 9, false, (byte) 0);
        this.aClass281_10311 = class281_2;
    }

    void method13021() {
    }

    void method13015() {
    }

}
