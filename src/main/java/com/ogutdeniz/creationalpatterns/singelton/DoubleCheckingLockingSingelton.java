package com.ogutdeniz.creationalpatterns.singelton;

public class DoubleCheckingLockingSingelton {
    private static volatile DoubleCheckingLockingSingelton instance;

    private DoubleCheckingLockingSingelton() {

    }

    public static DoubleCheckingLockingSingelton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckingLockingSingelton.class) {
                if (instance == null) {
                    instance = new DoubleCheckingLockingSingelton();
                }
            }
        }
        return instance;
    }
}
