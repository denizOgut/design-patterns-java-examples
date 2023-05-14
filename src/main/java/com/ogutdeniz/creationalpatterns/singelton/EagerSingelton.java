package com.ogutdeniz.creationalpatterns.singelton;

public class EagerSingelton {
    private static EagerSingelton instance = new EagerSingelton();

    private EagerSingelton() {

    }

    public static EagerSingelton getInstance() {
        return instance;
    }
}
