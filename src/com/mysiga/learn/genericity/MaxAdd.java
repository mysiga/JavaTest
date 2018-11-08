package com.mysiga.learn.genericity;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Wilson on 2018/11/8.
 */
public class MaxAdd {
    public static void main(String[] args) {
        int add1 = 777777777;
        int add2 = 333333333;

        System.out.println(add(String.valueOf(add1), String.valueOf(add2)));

    }

    /**
     * 求两个大整数和，时间复杂度为O(N)
     *
     * @param add1
     * @param add2
     * @return
     */
    public static String add(String add1, String add2) {
        if (add1 == null || add2 == null) {
            throw new IllegalArgumentException("add1 or add2 参数异常");
        }
        char[] add1Array = add1.toCharArray();
        char[] add2Array = add2.toCharArray();
        if (add1Array.length > add2Array.length) {
            int length = add1Array.length - add2Array.length;
            add2Array = createZero(length, add2).toCharArray();
        } else {
            int length = add2Array.length - add1Array.length;
            add1Array = createZero(length, add1).toCharArray();
        }
        int TenString = 0;
        int[] resultArray = new int[add1Array.length + 1];
        for (int i = add1Array.length - 1; i >=0; i--) {
            int add1Num = Integer.parseInt(add1Array[i] + "");
            int add2Num = Integer.parseInt(add2Array[i] + "");
            int result = add1Num + add2Num + TenString;
            resultArray[i + 1] = result % 10;
            TenString = result / 10;
        }

        resultArray[0] = TenString;

        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] == 0 && i == 0) {
                resultBuilder.append("");
            } else {
                resultBuilder.append(resultArray[i]);
            }
        }
        return resultBuilder.toString();
    }

    @NotNull
    private static String createZero(int length, String add) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append("0");
        }
        return stringBuilder.append(add).toString();
    }
}
