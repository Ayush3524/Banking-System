package com.system.services;

public class Exit {
    public static void exit() throws InterruptedException {
        System.out.print("Exiting System");
        for (int i = 0; i < 4; i++) {
            Thread.sleep(450);
            System.out.print(".");
        }
        System.exit(0);
    }
}
