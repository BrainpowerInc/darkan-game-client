package com.jagex;

import jaclib.ping.Ping;

import java.awt.*;
import java.awt.Desktop.Action;
import java.net.InetAddress;
import java.net.URI;
import java.util.LinkedList;
import java.util.Queue;

public class PingRequester implements Runnable {

    public static int anInt5864;

    Object anObject5862 = new Object();
    Queue requestQueue = new LinkedList();
    Thread requestThread = new Thread(this);

    public PingRequest createPingRequest(String ip) {
        if (this.requestThread == null) {
            throw new IllegalStateException("");
        } else if (ip == null) {
            throw new IllegalArgumentException("");
        } else {
            PingRequest class510_3 = new PingRequest(ip);
            this.queueRequest(class510_3, -1763010472);
            return class510_3;
        }
    }

    public PingRequester() {
        this.requestThread.setDaemon(true);
        this.requestThread.start();
    }

    void queueRequest(Object object_1, int i_2) {
        Queue queue_3 = this.requestQueue;
        synchronized (this.requestQueue) {
            this.requestQueue.add(object_1);
            this.requestQueue.notify();
        }
    }

    public void method8733() {
        if (this.requestThread != null) {
            this.queueRequest(this.anObject5862, -2004280805);
            try {
                this.requestThread.join();
            } catch (InterruptedException interruptedexception_3) {
            }
            this.requestThread = null;
        }
    }

    public void run() {
        while (true) {
            PingRequest request;
            synchronized (this.requestQueue) {
                Object object_3;
                for (object_3 = this.requestQueue.poll(); object_3 == null; object_3 = this.requestQueue.poll()) {
                    try {
                        this.requestQueue.wait();
                    } catch (InterruptedException interruptedexception_7) {
                    }
                }
                if (object_3 == this.anObject5862) {
                    return;
                }
                request = (PingRequest) object_3;
            }
            int ping;
            try {
                byte[] addr = InetAddress.getByName(request.ip).getAddress();
                ping = Ping.ping(addr[0], addr[1], addr[2], addr[3], 1000L);
            } catch (Throwable throwable_6) {
                ping = 1000;
            }
            request.ping = ping;
        }
    }

    public static void method8736(String string_0, boolean bool_1, boolean bool_2, String string_3, boolean bool_4, boolean bool_5, byte b_6) {
        if (bool_1) {
            if (!bool_4 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(new URI(string_0));
                    return;
                } catch (Exception exception_8) {
                }
            }
            if (GroundItemStrategy.aString8069.startsWith("win") && !bool_4) {
                GraphicsPreference.method12661(string_0, 0, (byte) -25);
            } else if (GroundItemStrategy.aString8069.startsWith("mac")) {
                Class186.method3082(string_0, 1, string_3);
            } else {
                GraphicsPreference.method12661(string_0, 2, (byte) -47);
            }
        } else {
            GraphicsPreference.method12661(string_0, 3, (byte) -77);
        }
    }
}
