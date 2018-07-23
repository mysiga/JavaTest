package com.mysiga.learn.throwable;

/**
 * Created by Wilson on 2018/7/16.
 */
public class TestError {
    public void testMethod(){
        try {
            custormException();
        } catch (CustomError e) {
            e.printStackTrace();
        }
    }
    public void custormException()throws  CustomError{
        throw new CustomError("抛出CustomError");
    }
    public static void main(String[] args) {
        TestError testError=new TestError();
        testError.testMethod();
    }
}
