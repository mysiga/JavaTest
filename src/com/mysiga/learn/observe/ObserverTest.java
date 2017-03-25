package com.mysiga.learn.observe;

/**
 * Created by Wilson on 2017/3/25.
 */
public class ObserverTest {
    public static void main(String[] args) {
        ObserverObject object=new ObserverObject();
        object.addObserver(new Father());
        object.addObserver(new Mother());
        object.learn();
    }
}
