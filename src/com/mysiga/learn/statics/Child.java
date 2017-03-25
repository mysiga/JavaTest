package com.mysiga.learn.statics;

/**
 * Created by Wilson on 2017/3/19.
 */
class Child extends Father{
    static{
        System.out.println("执行了子类静态语句块");
    }
}
