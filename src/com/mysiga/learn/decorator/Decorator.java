package com.mysiga.learn.decorator;

/**
 * Created by Wilson on 2018/3/12.
 */
public class Decorator implements Document {
    private Document document;

    public Decorator(Document document) {
        this.document = document;
    }

    @Override
    public void display() {
        document.display();
    }
}
