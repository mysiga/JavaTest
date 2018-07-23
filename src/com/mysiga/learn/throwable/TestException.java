package com.mysiga.learn.throwable;

/**
 * Created by Wilson on 2018/7/16.
 */
public class TestException {
    public void testMethod(){
        try {
            custormException();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
    public void custormException()throws  CustomException{
        throw new CustomException("抛出CustormException");
    }
    public static void main(String[] args) {
        TestException testException=new TestException();
        testException.testMethod();
    }
}
