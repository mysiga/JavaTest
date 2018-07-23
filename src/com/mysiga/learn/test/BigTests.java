package com.mysiga.learn.test;

import java.math.BigDecimal;

/**
 * Created by Wilson on 2017/8/31.
 */
public class BigTests {
    public static void main(String[] args) {
        System.out.println("1111111111 * 1111111111=" + 1111111111 * 1111111111);
        BigDecimal bigDecimal = BigDecimal.valueOf(1111111111);
        System.out.println("BigDecimal.valueOf(1111111111) * BigDecimal.valueOf(1111111111)=" + bigDecimal.multiply(bigDecimal).toString());
        System.out.println("11111111.111 * 11111111.111=" + 11111111.111 * 11111111.111);
        BigDecimal longDecimal = BigDecimal.valueOf(11111111.111);
        System.out.println("BigDecimal.valueOf(11111111.111) * BigDecimal.valueOf(11111111.111)=" + longDecimal.multiply(longDecimal).toString());
    }
}
