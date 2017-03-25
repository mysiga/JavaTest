package com.mysiga.learn.statics;

/**
 * Created by Wilson on 2017/3/19.
 */
public class Super {
    public static int m = 11;
    static{
        System.out.println("执行了super类静态语句块");
    }
}
