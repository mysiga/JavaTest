package com.mysiga.learn.genericity;

/**
 * Created by Wilson on 2018/11/6.
 */
public class Plate<T> {
    private T item;

    public Plate(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Plate<Fruit> plate = new Plate<>(new Apple());
        plate.set(new Apple());
        plate.get();
    }
}
