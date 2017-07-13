package com.mysiga.learn.strategy;

/**
 * 策略模式:策略抽象类{@link IStrategy},具体策略类{@link Kindle}和{@link Phone},环境类{@link Manage}
 */
public class StrategyTest {
    public static void main(String[] args) {
        Manage manage = new Manage(new Kindle());
        manage.buy();
    }
}
