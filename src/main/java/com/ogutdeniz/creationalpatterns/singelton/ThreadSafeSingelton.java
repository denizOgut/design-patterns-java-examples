package com.ogutdeniz.creationalpatterns.singelton;

public class ThreadSafeSingelton {
    private static ThreadSafeSingelton instance;

    private ThreadSafeSingelton() {

    }

    public static synchronized ThreadSafeSingelton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingelton();
        }
        return instance;
    }
}
