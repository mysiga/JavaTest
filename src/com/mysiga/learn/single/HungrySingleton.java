package com.mysiga.learn.single;

/**
 * hungry singleton class
 *
 * @author wilson.wu
 */

public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static final HungrySingleton getInstance() {
        return singleton;
    }
}
