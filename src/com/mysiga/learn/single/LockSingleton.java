package com.mysiga.learn.single;

/**
 * double lock singleton class
 *
 * @author wilson.wu
 */

public class LockSingleton {
    private static LockSingleton singleton;

    private LockSingleton() {
    }

    public static LockSingleton getInstance() {
        //single checked
        if (singleton == null) {
            synchronized (LockSingleton.class) {
                //doube checked
                if (singleton == null) {
                    singleton = new LockSingleton();
                }
            }
        }
        return singleton;
    }
}
