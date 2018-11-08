package com.mysiga.learn.test;

/**
 * Created by Wilson on 2018/10/9.
 */
public class SingleT {
    private static SingleT mSingleT;

    private SingleT() {

    }

    public static class Holder {
        public static final SingleT mInsten = new SingleT();
    }

    public static final SingleT getSingle() {
        return Holder.mInsten;
    }
}
