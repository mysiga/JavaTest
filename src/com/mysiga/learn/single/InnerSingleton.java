package com.mysiga.learn.single;

/**
 * inner class singleton
 *
 * @author wilson.wu
 */

public class InnerSingleton {
    private InnerSingleton() {

    }

    private static class Holder {
        public static final InnerSingleton singleton = new InnerSingleton();
    }

    public static final InnerSingleton getInstance() {
        return Holder.singleton;
    }
}
