package com.mysiga.learn.decorator;

/**
 * Created by Wilson on 2018/3/12.
 */
public class PurchaseRequest implements Document {
    @Override
    public void display() {
        System.out.println("PurchaseRequest.display()");
    }
}
