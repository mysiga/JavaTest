package com.mysiga.learn.proxy;

/**
 * Created by Wilson on 2018/7/23.
 */
public class ReflectObject {
    public String name;
    private String username;

    public ReflectObject() {
    }

    @Override
    public String toString() {
        return "ReflectObject{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public void addName(String name, int year) {
        System.out.println("name:" + name + ",year:" + year);
    }
}
