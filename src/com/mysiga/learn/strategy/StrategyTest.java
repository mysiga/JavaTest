package com.mysiga.learn.strategy;

/**
 * Created by Wilson on 2017/3/25.
 */
public class StrategyTest {
    public static void main(String[] args) {
        Manage manage = new Manage(new Kindle());
        manage.buy();
    }
}
