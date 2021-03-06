package com.jagex;

public class LightIntensityIndexLoader {

    LRUCache aClass229_5334 = new LRUCache(64);
    Index aClass317_5333;

    public LightIntensityIndexLoader(Index index_3) {
        aClass317_5333 = index_3;
        aClass317_5333.filesCount(SharedConfigsType.LIGHT_INTENSITIES.id);
    }

    static void method7313(SubInterface class282_sub44_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        if (MovingAnimation.isInterfaceLoaded(i_1, null)) {
            if (class282_sub44_0 != null && !class282_sub44_0.method13401()) {
                Class351.closeChildren(class282_sub44_0, true, false);
            } else {
                Interface interface_11 = CustomCursorsPreference.INTERFACES[i_1];
                client.method11768(interface_11, interface_11.method1616(), -1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9);
            }
        }

    }

    public LightIntensityDefinitions method7304(int i_1) {
        LRUCache softcache_4 = aClass229_5334;
        LightIntensityDefinitions class416_3;
        synchronized (aClass229_5334) {
            class416_3 = (LightIntensityDefinitions) aClass229_5334.get(i_1);
        }

        if (class416_3 != null) {
            return class416_3;
        } else {
            Index index_5 = aClass317_5333;
            byte[] bytes_10;
            synchronized (aClass317_5333) {
                bytes_10 = aClass317_5333.getFile(SharedConfigsType.LIGHT_INTENSITIES.id, i_1);
            }

            class416_3 = new LightIntensityDefinitions();
            if (bytes_10 != null) {
                class416_3.method6999(new ByteBuf(bytes_10));
            }

            LRUCache softcache_9 = aClass229_5334;
            synchronized (aClass229_5334) {
                aClass229_5334.put(class416_3, i_1);
                return class416_3;
            }
        }
    }

    public void method7306() {
        LRUCache softcache_2 = aClass229_5334;
        synchronized (aClass229_5334) {
            aClass229_5334.method3859();
        }
    }

    public void method7307() {
        LRUCache softcache_3 = aClass229_5334;
        synchronized (aClass229_5334) {
            aClass229_5334.method3858(5);
        }
    }

    public void method7308() {
        LRUCache softcache_2 = aClass229_5334;
        synchronized (aClass229_5334) {
            aClass229_5334.method3863();
        }
    }

}
