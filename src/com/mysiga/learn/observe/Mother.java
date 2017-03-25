package com.mysiga.learn.observe;

/**
 * Created by Wilson on 2017/3/25.
 */
public class Mother implements Observer {
    @Override
    public void update() {
        System.out.println("Mother update");
    }
}
