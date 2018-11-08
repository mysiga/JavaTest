package com.mysiga.learn.exception;

/**
 * Created by Wilson on 2018/11/2.
 */
public class TestException {
    public static void showException(int i) throws CustomException {
        if (i == 0) {
            throw new CustomException("showException");
        }
        System.out.println("showException");
    }

    public static void showThrowable() throws CustomThrowable {
        System.out.println("showThrowable");
    }

    public static void main(String[] args) {
        try {
            TestException.showException(0);
        } catch (CustomException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            showThrowable();
        } catch (CustomThrowable customThrowable) {
            customThrowable.printStackTrace();
            System.out.println(customThrowable.getMessage());
        }
    }
}
