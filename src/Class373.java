import java.awt.Point;
import java.util.Queue;

public class Class373 {

	public static int anInt4350;

	Class373() throws Throwable {
		throw new Error();
	}

	static void method6365() {
		Queue queue_1 = Class236.aQueue2914;
		synchronized (Class236.aQueue2914) {
			Point point_2;
			if (Class351.gameCanvas.isShowing()) {
				point_2 = Class351.gameCanvas.getLocationOnScreen();
			} else {
				point_2 = null;
			}
			while (true) {
				while (true) {
					MouseRecord_Sub1 class282_sub53_sub1_3 = (MouseRecord_Sub1) Class236.aQueue2914.poll();
					if (class282_sub53_sub1_3 == null) {
						return;
					}
					if (point_2 != null && Class351.gameCanvas.isShowing() && Class530.appletHasFocus) {
						class282_sub53_sub1_3.method14732(point_2);
						if (!class282_sub53_sub1_3.method14731() && class282_sub53_sub1_3.method13481(1700591909) < Class349.anInt4083 && class282_sub53_sub1_3.method13469(1495235000) < Engine.anInt3243 * -969250379 && class282_sub53_sub1_3.method13481(1815146840) >= 0 && class282_sub53_sub1_3.method13469(-1984385021) >= 0) {
							int i_4 = class282_sub53_sub1_3.getClickType();
							if (class282_sub53_sub1_3.getClickType() == -1) {
								Class236.aClass534_Sub1_2913.method11410(class282_sub53_sub1_3);
							} else if (Class298.method5304(i_4, -1867456508)) {
								Class236.aClass534_Sub1_2913.method12809(class282_sub53_sub1_3);
							}
						}
					} else {
						class282_sub53_sub1_3.cache(665742059);
					}
				}
			}
		}
	}
}
