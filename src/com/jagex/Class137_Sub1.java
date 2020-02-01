package com.jagex;
import jaggl.OpenGL;

public class Class137_Sub1 extends Class137 {

	int anInt9087;
	int anInt9086;

	Class137_Sub1(OpenGLGraphicalRenderer class505_sub1_1, int i_2, int i_3, int i_4, boolean bool_5, int[] ints_6, int i_7, int i_8, boolean bool_9) {
		super(class505_sub1_1, i_2, Class150.aClass150_1949, Class76.aClass76_751, i_3 * i_4, bool_5);
		this.anInt9087 = i_3;
		this.anInt9086 = i_4;
		if (bool_9) {
			int[] ints_10 = new int[ints_6.length];

			for (int i_11 = 0; i_11 < i_4; i_11++) {
				int i_12 = i_3 * i_11;
				int i_13 = i_3 * (i_4 - i_11 - 1);

				for (int i_14 = 0; i_14 < i_3; i_14++) {
					ints_10[i_12++] = ints_6[i_13++];
				}
			}

			ints_6 = ints_10;
		}

		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		if (this.anInt1648 != 34037 && bool_5 && i_7 == 0 && i_8 == 0) {
			method2371(this.anInt1648, OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651), this.anInt9087, this.anInt9086, this.aGraphicalRenderer_Sub1_1646.anInt8410, ints_6);
			this.method2354(true);
		} else {
			OpenGL.glPixelStorei(3314, i_7);
			OpenGL.glTexImage2Di(this.anInt1648, 0, OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651), this.anInt9087, this.anInt9086, 0, 32993, this.aGraphicalRenderer_Sub1_1646.anInt8410, ints_6, i_8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method2354(false);
		}

		this.method2351(true);
	}

	Class137_Sub1(OpenGLGraphicalRenderer class505_sub1_1, int i_2, Class150 class150_3, Class76 class76_4, int i_5, int i_6, boolean bool_7, byte[] bytes_8, Class150 class150_9, boolean bool_10) {
		super(class505_sub1_1, i_2, class150_3, class76_4, i_5 * i_6, bool_7);
		this.anInt9087 = i_5;
		this.anInt9086 = i_6;
		if (bool_10) {
			byte[] bytes_11 = new byte[bytes_8.length];

			for (int i_12 = 0; i_12 < i_6; i_12++) {
				int i_13 = i_5 * i_12;
				int i_14 = i_5 * (i_6 - i_12 - 1);

				for (int i_15 = 0; i_15 < i_5; i_15++) {
					bytes_11[i_13++] = bytes_8[i_14++];
				}
			}

			bytes_8 = bytes_11;
		}

		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool_7 && this.anInt1648 != 34037) {
			method2359(i_2, OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651), i_5, i_6, class150_9, bytes_8);
			this.method2354(true);
		} else {
			OpenGL.glTexImage2Dub(this.anInt1648, 0, OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651), this.anInt9087, this.anInt9086, 0, OpenGLGraphicalRenderer.method13629(class150_9), 5121, bytes_8, 0);
			this.method2354(false);
		}

		OpenGL.glPixelStorei(3317, 4);
		this.method2351(true);
	}

	Class137_Sub1(OpenGLGraphicalRenderer class505_sub1_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		super(class505_sub1_1, i_2, Class150.aClass150_1950, Class76.aClass76_751, i_5 * i_6, false);
		this.anInt9087 = i_5;
		this.anInt9086 = i_6;
		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		Class158 class158_7 = this.aGraphicalRenderer_Sub1_1646.method8523((byte) 125);
		if (class158_7 != null) {
			int i_8 = class158_7.method2716() - (i_4 + i_6);
			int i_9 = OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651);
			OpenGL.glCopyTexImage2D(this.anInt1648, 0, i_9, i_3, i_8, i_5, i_6, 0);
		}

		this.method2351(true);
	}

	Class137_Sub1(OpenGLGraphicalRenderer class505_sub1_1, Class150 class150_3, Class76 class76_4, int i_5, int i_6, boolean bool_7, float[] floats_8, Class150 class150_9) {
		super(class505_sub1_1, 3553, class150_3, class76_4, i_5 * i_6, bool_7);
		this.anInt9087 = i_5;
		this.anInt9086 = i_6;
		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		if (bool_7 && this.anInt1648 != 34037) {
			method2361(OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651), i_5, i_6, class150_9, floats_8);
			this.method2354(true);
		} else {
			OpenGL.glTexImage2Df(this.anInt1648, 0, OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651), this.anInt9087, this.anInt9086, 0, OpenGLGraphicalRenderer.method13629(class150_9), 5126, floats_8, 0);
			this.method2354(false);
		}

		this.method2351(true);
	}

	void method14439(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		Class158 class158_7 = this.aGraphicalRenderer_Sub1_1646.method8523((byte) 122);
		if (class158_7 != null) {
			int i_8 = class158_7.method2716() - (i_4 + i_6);
			this.aGraphicalRenderer_Sub1_1646.method13654(this);
			OpenGL.glCopyTexSubImage2D(this.anInt1648, 0, i_1, this.anInt9086 - (i_2 + i_4), i_5, i_8, i_3, i_4);
			OpenGL.glFlush();
		}

	}

	Interface8 method14440() {
		return new Class154(this);
	}

	Interface9 method14441() {
		return new Class154(this);
	}

	void method14445(boolean bool_1, boolean bool_2) {
		if (this.anInt1648 == 3553) {
			this.aGraphicalRenderer_Sub1_1646.method13654(this);
			OpenGL.glTexParameteri(this.anInt1648, 10242, bool_1 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt1648, 10243, bool_2 ? 10497 : 33071);
		}

	}

	Class137_Sub1(OpenGLGraphicalRenderer class505_sub1_1, int i_2, Class150 class150_3, Class76 class76_4, int i_5, int i_6) {
		super(class505_sub1_1, i_2, class150_3, class76_4, i_5 * i_6, false);
		this.anInt9087 = i_5;
		this.anInt9086 = i_6;
		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		OpenGL.glTexImage2Dub(this.anInt1648, 0, OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651), i_5, i_6, 0, OpenGLGraphicalRenderer.method13629(this.aClass150_1650), 5121, (byte[]) null, 0);
		this.method2351(true);
	}

	void method14452(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_7) {
		if (i_7 == 0) {
			i_7 = i_3;
		}

		int[] ints_9 = new int[i_3 * i_4];

		for (int i_10 = 0; i_10 < i_4; i_10++) {
			int i_11 = i_3 * i_10;
			int i_12 = (i_4 - i_10 - 1) * i_7 + 0;

			for (int i_13 = 0; i_13 < i_3; i_13++) {
				ints_9[i_11++] = ints_5[i_12++];
			}
		}

		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		if (i_3 != i_7) {
			OpenGL.glPixelStorei(3314, i_7);
		}

		OpenGL.glTexSubImage2Di(this.anInt1648, 0, i_1, this.anInt9086 - i_2 - i_4, i_3, i_4, 32993, this.aGraphicalRenderer_Sub1_1646.anInt8410, ints_9, 0);
		if (i_3 != i_7) {
			OpenGL.glPixelStorei(3314, 0);
		}

	}

	void method14455(int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_8, boolean bool_9) {
		if (i_8 == 0) {
			i_8 = i_3;
		}

		if (bool_9) {
			int i_10 = class150_6.anInt1959;
			int i_11 = i_3 * i_10;
			int i_12 = i_10 * i_8;
			byte[] bytes_13 = new byte[i_11 * i_4];

			for (int i_14 = 0; i_14 < i_4; i_14++) {
				int i_15 = i_14 * i_11;
				int i_16 = i_12 * (i_4 - i_14 - 1) + 0;

				for (int i_17 = 0; i_17 < i_11; i_17++) {
					bytes_13[i_15++] = bytes_5[i_16++];
				}
			}

			bytes_5 = bytes_13;
		}

		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_3 != i_8) {
			OpenGL.glPixelStorei(3314, i_8);
		}

		OpenGL.glTexSubImage2Dub(this.anInt1648, 0, 0, this.anInt9086 - i_2 - i_4, i_3, i_4, OpenGLGraphicalRenderer.method13629(class150_6), 5121, bytes_5, 0);
		if (i_3 != i_8) {
			OpenGL.glPixelStorei(3314, 0);
		}

		OpenGL.glPixelStorei(3317, 4);
	}

}