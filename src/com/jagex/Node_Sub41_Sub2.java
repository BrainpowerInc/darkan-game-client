package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Node_Sub41_Sub2 extends Node_Sub41 {

    int anInt9464;
    int anInt9467;
    String aString9466;
    String aString9469;
    float aFloat9462;
    float aFloat9465;
    String aString9470;

    void method13362(OggPacket oggpacket_1) {
        if (this.anInt8031 <= 0 || "SUB".equals(this.aString9469)) {
            RsByteBuffer rsbytebuffer_3 = new RsByteBuffer(oggpacket_1.getData());
            int i_4 = rsbytebuffer_3.readUnsignedByte();
            if (this.anInt8031 <= 8) {
                if ((i_4 | 0x80) == 0) {
                    throw new IllegalStateException();
                }

                if (this.anInt8031 == 0) {
                    rsbytebuffer_3.index += 23;
                    this.anInt9464 = rsbytebuffer_3.method13085(-190193364);
                    this.anInt9467 = rsbytebuffer_3.method13085(-2132826007);
                    if (this.anInt9464 == 0 || this.anInt9467 == 0) {
                        throw new IllegalStateException();
                    }

                    RsByteBuffer rsbytebuffer_12 = new RsByteBuffer(16);
                    rsbytebuffer_3.readBytes(rsbytebuffer_12.buffer, 0, 16);
                    this.aString9466 = rsbytebuffer_12.readString();
                    rsbytebuffer_12.index = 0;
                    rsbytebuffer_3.readBytes(rsbytebuffer_12.buffer, 0, 16);
                    this.aString9469 = rsbytebuffer_12.readString();
                }
            } else {
                if (i_4 == 0) {
                    label64:
                    {
                        long long_5 = rsbytebuffer_3.method13278((byte) 91);
                        long long_7 = rsbytebuffer_3.method13278((byte) 49);
                        long long_9 = rsbytebuffer_3.method13278((byte) 65);
                        if (long_5 >= 0L && long_7 >= 0L && long_9 >= 0L && long_9 <= long_5) {
                            this.aFloat9462 = (float) ((long) this.anInt9467 * long_5) / (float) this.anInt9464;
                            this.aFloat9465 = (float) ((long) this.anInt9467 * (long_7 + long_5)) / (float) this.anInt9464;
                            int i_11 = rsbytebuffer_3.method13085(737852969);
                            if (i_11 >= 0 && i_11 <= rsbytebuffer_3.buffer.length - rsbytebuffer_3.index) {
                                this.aString9470 = Class271.method4824(rsbytebuffer_3.buffer, rsbytebuffer_3.index, i_11);
                                break label64;
                            }

                            throw new IllegalStateException();
                        }

                        throw new IllegalStateException();
                    }
                }

                if ((i_4 | 0x80) != 0) {
                    return;
                }
            }
        }

    }

    public float method14702() {
        return this.aFloat9462;
    }

    void method13366(OggPacket oggpacket_1) {
        if (this.anInt8031 * 1669091145 * -509226247 <= 0 || "SUB".equals(this.aString9469)) {
            RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(oggpacket_1.getData());
            int i_3 = rsbytebuffer_2.readUnsignedByte();
            if (-509226247 * this.anInt8031 * 1669091145 <= 8) {
                if ((i_3 | 0x80) == 0) {
                    throw new IllegalStateException();
                }

                if (-509226247 * this.anInt8031 * 1669091145 == 0) {
                    rsbytebuffer_2.index = (rsbytebuffer_2.index * -1115476867 + 113835835) * -1990677291;
                    this.anInt9464 = rsbytebuffer_2.method13085(-1091796694) * -1289985113 * 658904087;
                    this.anInt9467 = rsbytebuffer_2.method13085(-1792270527) * -134578141 * 1762799499;
                    if (this.anInt9464 * -1289985113 * 658904087 == 0 || 1762799499 * this.anInt9467 * -134578141 == 0) {
                        throw new IllegalStateException();
                    }

                    RsByteBuffer rsbytebuffer_11 = new RsByteBuffer(16);
                    rsbytebuffer_2.readBytes(rsbytebuffer_11.buffer, 0, 16);
                    this.aString9466 = rsbytebuffer_11.readString();
                    rsbytebuffer_11.index = 0 * -1990677291;
                    rsbytebuffer_2.readBytes(rsbytebuffer_11.buffer, 0, 16);
                    this.aString9469 = rsbytebuffer_11.readString();
                }
            } else {
                if (i_3 == 0) {
                    label64:
                    {
                        long long_4 = rsbytebuffer_2.method13278((byte) 70);
                        long long_6 = rsbytebuffer_2.method13278((byte) 34);
                        long long_8 = rsbytebuffer_2.method13278((byte) 20);
                        if (long_4 >= 0L && long_6 >= 0L && long_8 >= 0L && long_8 <= long_4) {
                            this.aFloat9462 = (float) ((long) (1762799499 * this.anInt9467 * -134578141) * long_4) / (float) (this.anInt9464 * -1289985113 * 658904087);
                            this.aFloat9465 = (float) ((long) (1762799499 * this.anInt9467 * -134578141) * (long_6 + long_4)) / (float) (658904087 * this.anInt9464 * -1289985113);
                            int i_10 = rsbytebuffer_2.method13085(-458972533);
                            if (i_10 >= 0 && i_10 <= rsbytebuffer_2.buffer.length - -1990677291 * rsbytebuffer_2.index * -1115476867) {
                                this.aString9470 = Class271.method4824(rsbytebuffer_2.buffer, rsbytebuffer_2.index * -1115476867 * -1990677291, i_10);
                                break label64;
                            }

                            throw new IllegalStateException();
                        }

                        throw new IllegalStateException();
                    }
                }

                if ((i_3 | 0x80) != 0) {
                    return;
                }
            }
        }

    }

    String method14703(int i_1) {
        return this.aString9466;
    }

    public String method14704() {
        return this.aString9470;
    }

    void method13360() {
    }

    void method13363(OggPacket oggpacket_1) {
        if (this.anInt8031 * 1669091145 * -509226247 <= 0 || "SUB".equals(this.aString9469)) {
            RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(oggpacket_1.getData());
            int i_3 = rsbytebuffer_2.readUnsignedByte();
            if (-509226247 * this.anInt8031 * 1669091145 <= 8) {
                if ((i_3 | 0x80) == 0) {
                    throw new IllegalStateException();
                }

                if (-509226247 * this.anInt8031 * 1669091145 == 0) {
                    rsbytebuffer_2.index = (rsbytebuffer_2.index * -1115476867 + 113835835) * -1990677291;
                    this.anInt9464 = rsbytebuffer_2.method13085(-204880064) * -1289985113 * 658904087;
                    this.anInt9467 = rsbytebuffer_2.method13085(288642757) * -134578141 * 1762799499;
                    if (this.anInt9464 * -1289985113 * 658904087 == 0 || 1762799499 * this.anInt9467 * -134578141 == 0) {
                        throw new IllegalStateException();
                    }

                    RsByteBuffer rsbytebuffer_11 = new RsByteBuffer(16);
                    rsbytebuffer_2.readBytes(rsbytebuffer_11.buffer, 0, 16);
                    this.aString9466 = rsbytebuffer_11.readString();
                    rsbytebuffer_11.index = 0 * -1990677291;
                    rsbytebuffer_2.readBytes(rsbytebuffer_11.buffer, 0, 16);
                    this.aString9469 = rsbytebuffer_11.readString();
                }
            } else {
                if (i_3 == 0) {
                    label64:
                    {
                        long long_4 = rsbytebuffer_2.method13278((byte) 117);
                        long long_6 = rsbytebuffer_2.method13278((byte) 11);
                        long long_8 = rsbytebuffer_2.method13278((byte) 26);
                        if (long_4 >= 0L && long_6 >= 0L && long_8 >= 0L && long_8 <= long_4) {
                            this.aFloat9462 = (float) ((long) (1762799499 * this.anInt9467 * -134578141) * long_4) / (float) (this.anInt9464 * -1289985113 * 658904087);
                            this.aFloat9465 = (float) ((long) (1762799499 * this.anInt9467 * -134578141) * (long_6 + long_4)) / (float) (658904087 * this.anInt9464 * -1289985113);
                            int i_10 = rsbytebuffer_2.method13085(922776057);
                            if (i_10 >= 0 && i_10 <= rsbytebuffer_2.buffer.length - -1990677291 * rsbytebuffer_2.index * -1115476867) {
                                this.aString9470 = Class271.method4824(rsbytebuffer_2.buffer, rsbytebuffer_2.index * -1115476867 * -1990677291, i_10);
                                break label64;
                            }

                            throw new IllegalStateException();
                        }

                        throw new IllegalStateException();
                    }
                }

                if ((i_3 | 0x80) != 0) {
                    return;
                }
            }
        }

    }

    public float method14705(byte b_1) {
        return this.aFloat9465;
    }

    void method13365() {
    }

    Node_Sub41_Sub2(OggStreamState oggstreamstate_1) {
        super(oggstreamstate_1);
    }

    void method13364() {
    }

}
