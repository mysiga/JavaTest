package com.mysiga.learn.single;

/**
 * Created by wilson.wu on 2017/2/8.
 */

public class SingleTest {
    public static void main(String[] args) {
        InnerSingleton.getInstance();
        HungrySingleton.getInstance();
        LockSingleton.getInstance();
    }
}
