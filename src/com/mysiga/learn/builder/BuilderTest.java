package com.mysiga.learn.builder;

/**
 * Created by Wilson on 2017/3/25.
 */
public class BuilderTest {

    public static void main(String[] args) {
        Person.Builder builder=new Person.Builder("yang");
        builder.setHight(124);
        builder.setYear("12");
        Person person=builder.create();
        person.toString();
    }
}
