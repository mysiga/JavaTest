package com.mysiga.learn.strategy;

/**
 * Created by Wilson on 2017/3/25.
 */
public class Manage {
    private IStrategy strategy;

    public Manage(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void buy() {
        strategy.doSomething();
    }
}
