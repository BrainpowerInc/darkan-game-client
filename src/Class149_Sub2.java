public class Class149_Sub2 extends Class149 {

	public static Defaults7Loader DEFAULTS_LOADER_7;
	public static NativeSprite aNativeSprite_9315;
	public static FriendStatus FRIEND_STATUS;
	int anInt9306;
	int anInt9307;
	int anInt9305;
	int anInt9309;
	int anInt9308;
	int anInt9311;
	int anInt9312;
	int anInt9313;

	void method2560(int i_1, int i_2) {
	}

	void method2556(int i_1, int i_2) {
	}

	void method2557(int i_1, int i_2) {
	}

	Class149_Sub2(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
		super(-1, i_9, i_10);
		this.anInt9306 = i_1;
		this.anInt9307 = i_2;
		this.anInt9305 = i_3;
		this.anInt9309 = i_4;
		this.anInt9308 = i_5;
		this.anInt9311 = i_6;
		this.anInt9312 = i_7;
		this.anInt9313 = i_8;
	}

	void method2561(int i_1, int i_2) {
		int i_4 = this.anInt9306 * i_1 >> 12;
		int i_5 = i_2 * this.anInt9307 >> 12;
		int i_6 = this.anInt9305 * i_1 >> 12;
		int i_7 = i_2 * this.anInt9309 >> 12;
		int i_8 = this.anInt9308 * i_1 >> 12;
		int i_9 = i_2 * this.anInt9311 >> 12;
		int i_10 = this.anInt9312 * i_1 >> 12;
		int i_11 = i_2 * this.anInt9313 >> 12;
		Node_Sub24.method12399(i_4, i_5, i_6, i_7, i_8, i_9, i_10, i_11, this.anInt1741, -2112758099);
	}

	void method2558(int i_1, int i_2) {
	}

	void method2562(int i_1, int i_2) {
	}

	void method2555(int i_1, int i_2) {
		int i_3 = this.anInt9306 * -1663850125 * -574250053 * i_1 >> 12;
		int i_4 = this.anInt9307 * 489790669 * 724021253 * i_2 >> 12;
		int i_5 = i_1 * -1184156077 * this.anInt9305 * 1559657947 >> 12;
		int i_6 = i_2 * this.anInt9309 * -1469754047 * -1849017663 >> 12;
		int i_7 = this.anInt9308 * -590934233 * -108826473 * i_1 >> 12;
		int i_8 = i_2 * 1636198257 * this.anInt9311 * -1674872431 >> 12;
		int i_9 = i_1 * this.anInt9312 * -1310894617 * 905637335 >> 12;
		int i_10 = this.anInt9313 * 745027993 * 264374953 * i_2 >> 12;
		Node_Sub24.method12399(i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, -1525176857 * this.anInt1741 * -1378640425, -2120176712);
	}

	void method2559(int i_1, int i_2) {
		int i_3 = this.anInt9306 * -1663850125 * -574250053 * i_1 >> 12;
		int i_4 = this.anInt9307 * 489790669 * 724021253 * i_2 >> 12;
		int i_5 = i_1 * -1184156077 * this.anInt9305 * 1559657947 >> 12;
		int i_6 = i_2 * this.anInt9309 * -1469754047 * -1849017663 >> 12;
		int i_7 = this.anInt9308 * -590934233 * -108826473 * i_1 >> 12;
		int i_8 = i_2 * 1636198257 * this.anInt9311 * -1674872431 >> 12;
		int i_9 = i_1 * this.anInt9312 * -1310894617 * 905637335 >> 12;
		int i_10 = this.anInt9313 * 745027993 * 264374953 * i_2 >> 12;
		Node_Sub24.method12399(i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, -1525176857 * this.anInt1741 * -1378640425, -2131700490);
	}

	public static void method14609(Player player_0) {
		Node_Sub48 class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass465_8075.get((long) player_0.index);
		if (class282_sub48_2 != null) {
			if (class282_sub48_2.aNode_Sub15_Sub5_8099 != null) {
				Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_2.aNode_Sub15_Sub5_8099);
				class282_sub48_2.aNode_Sub15_Sub5_8099 = null;
			}

			class282_sub48_2.remove();
		}

	}

	static int method14610(Player player_0, int i_1) {
		int i_2 = player_0.rotate90RightAnimation;
		RenderAnimDefs renderanimdefs_3 = player_0.getRenderAnimDefs();
		int i_4 = player_0.aAnimation_Sub3_10337.method7597();
		if (i_4 != -1 && !player_0.aAnimation_Sub3_10337.aBool7891) {
			if (i_4 != renderanimdefs_3.runningAnimation && i_4 != renderanimdefs_3.runDir3 && i_4 != renderanimdefs_3.runDir1 && i_4 != renderanimdefs_3.runDir2) {
				if (i_4 == renderanimdefs_3.teleportingAnimation || i_4 == renderanimdefs_3.teleDir3 || i_4 == renderanimdefs_3.teleDir1 || i_4 == renderanimdefs_3.teleDir2) {
					i_2 = player_0.rotate180Animation;
				}
			} else {
				i_2 = player_0.rotate90LeftAnimation;
			}
		} else {
			i_2 = player_0.walkingAnimation;
		}

		return i_2;
	}

}
