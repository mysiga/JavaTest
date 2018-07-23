package com.mysiga.learn.test;

/**
 * Created by Wilson on 2017/8/15.
 */
public class Person {
    private Year year;
    private int glide;

    public Year getYear() {
        return year;
    }

    public int getGlide() {
        return glide;
    }

    public static void main(String[] args) {
        Person person=new Person();
        if (person.getYear() == null) {
            System.out.println("person.getYear() == null");
        } else {
            System.out.println("person.getYear() != null");
        }

    }
}
