package com.mysiga.learn.archetype;

/**
 * 原型设计模式
 */
public class Client {
    public static void main(String[] args) {
        WeekLog log = new WeekLog();
        log.setName("张无忌");
        log.setDate("第12周");
        log.setContent("这周工作很忙，每天加班");

        System.out.println("*****周报****");
        System.out.println("周次:" + log.getDate());
        System.out.println("姓名:" + log.getName());
        System.out.println("内容:" + log.getContent());
        System.out.println("-------------------");

        WeekLog logNew=log.clone();
        logNew.setDate("第13周");
        System.out.println("*****周报****");
        System.out.println("周次:" + logNew.getDate());
        System.out.println("姓名:" + logNew.getName());
        System.out.println("内容:" + logNew.getContent());
        System.out.println("-------------------");
    }
}
