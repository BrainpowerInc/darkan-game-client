package com.jagex;

public class Class404 {

    static Interface36 LIBRARY_LOADER;
    static Class466 aClass466_4831;

    Class404() throws Throwable {
        throw new Error();
    }

    public static void setFCRank(String string_0, int i_1) {
        BufferedConnectionContext class184_3 = Preference_Sub20.getConnectionContext();
        TCPPacket tcpmessage_4 = Class271.createPacket(ClientProt.FC_SET_RANK, class184_3.isaac);
        tcpmessage_4.buffer.writeByte(1 + ChatLine.getLength(string_0));
        tcpmessage_4.buffer.write128Byte(i_1);
        tcpmessage_4.buffer.writeString(string_0);
        class184_3.queuePacket(tcpmessage_4);
    }

    static void method6810() {
        if (Class20.aCacheableNode_Sub15_163 != null) {
            Class20.aCacheableNode_Sub15_163 = null;
            Class292.method5201(Class341.anInt3996, CacheableNode_Sub2.anInt9471, ObjectAnimationCutsceneAction.anInt8518, GraphNode_Sub1_Sub5_Sub1.anInt10526);
        }

    }

    public static void method6811(int i_0) {
        if (Class113.CLAN_CHANNEL != null && i_0 >= 0 && i_0 < Class113.CLAN_CHANNEL.numPlayers) {
            ClanChannelPlayer class57_2 = Class113.CLAN_CHANNEL.players[i_0];
            if (class57_2.rank == -1) {
                BufferedConnectionContext class184_3 = Preference_Sub20.getConnectionContext();
                TCPPacket tcpmessage_4 = Class271.createPacket(ClientProt.UNUSED_CLAN_OP, class184_3.isaac);
                tcpmessage_4.buffer.writeByte(2 + ChatLine.getLength(class57_2.name));
                tcpmessage_4.buffer.writeShort(i_0);
                tcpmessage_4.buffer.writeString(class57_2.name);
                class184_3.queuePacket(tcpmessage_4);
            }
        }

    }

}
