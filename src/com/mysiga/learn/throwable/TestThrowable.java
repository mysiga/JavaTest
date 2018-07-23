package com.mysiga.learn.throwable;

/**
 * Created by Wilson on 2018/7/16.
 */
public class TestThrowable {
    public void testMethod(){
        try {
            custormException();
        } catch (CustomThrowable e) {
            e.printStackTrace();
        }
    }
    public void custormException()throws  CustomThrowable{
        throw new CustomThrowable("抛出CustomThrowable");
    }
    public static void main(String[] args) {
        TestThrowable testThrowable=new TestThrowable();
        testThrowable.testMethod();
    }
}
