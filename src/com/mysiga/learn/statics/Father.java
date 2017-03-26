package com.mysiga.learn.statics;

/**
 * Created by Wilson on 2017/3/19.
 */
class Father extends Super{
    public static int m = 33;
    static{
        System.out.println("执行了父类静态语句块");
    }
    public static void getMethod() {
    }
}
