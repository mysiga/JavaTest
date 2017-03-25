package com.mysiga.learn.observe;

import java.util.ArrayList;

/**
 * Created by Wilson on 2017/3/25.
 */
public class ObserverObject {
    private ArrayList<Observer> observers = new ArrayList<>();

    public ObserverObject() {
    }

    public void addObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    public void removeListerner(Observer observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }

    public void learn() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
