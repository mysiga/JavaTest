package com.mysiga.learn.test;

/**
 * Created by Wilson on 2018/10/10.
 */
public class NameProxy implements IProxy {
    @Override
    public void getName() {
        System.out.println("NameProxy");
    }
}
