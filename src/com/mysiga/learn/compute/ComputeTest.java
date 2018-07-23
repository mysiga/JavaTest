package com.mysiga.learn.compute;

import java.math.BigDecimal;

/**
 * Created by Wilson on 2017/12/1.
 */
public class ComputeTest {
    public static void main(String[] args) {
        System.out.println("10*10=" + 10 * 10);
        System.out.println("222222222 * 1000000000=" + 222222222 * 1000000000);
        System.out.println("0.1 * 0.2=" + 0.1 * 0.2);
        System.out.println("2222222222.2 * 0.000001=" + 2222222222.2 * 0.000001);
        System.out.println("2222222222.2f * 1111111111.1f=" + 2222222222.2f * 1111111111.1f);
        System.out.println("222222222+1111111111=" + (222222222 + 1111111111));
        System.out.println("2222222222.2-1111111111=" + (222222222.2 - 1111111111));
        System.out.println("2222222222.2/2=" + 2222222222.2/2);

        System.out.println("使用:new BigDecimal()");
        System.out.println("10*10=" + new BigDecimal(10).multiply(new BigDecimal(10)));
        System.out.println("222222222 * 1000000000=" + new BigDecimal(222222222).multiply(new BigDecimal(1000000000)));
        System.out.println("0.1 * 0.2=" + new BigDecimal(0.1).multiply(new BigDecimal(0.2)));
        System.out.println("2222222222.2 * 0.000001=" + new BigDecimal(2222222222.2).multiply(new BigDecimal(0.000001)));
        System.out.println("2222222222.2f * 1111111111.1f=" + new BigDecimal(2222222222.2f).multiply(new BigDecimal(1111111111.1f)));
        System.out.println("222222222+1111111111=" + (new BigDecimal(222222222).add(new BigDecimal(1111111111))));
        System.out.println("2222222222.2-1111111111=" + (new BigDecimal(222222222.2).subtract(new BigDecimal(1111111111))));
        System.out.println("2222222222.2/2=" + new BigDecimal(2222222222.2).divide(new BigDecimal(2)).toString());

        System.out.println("官网建议优先使用:new BigDecimal(String)");
        System.out.println("10*10=" + new BigDecimal("10").multiply(new BigDecimal("10")));
        System.out.println("222222222 * 1000000000=" + new BigDecimal("222222222").multiply(new BigDecimal("1000000000")));
        System.out.println("0.1 * 0.2=" + new BigDecimal("0.1").multiply(new BigDecimal("0.2")));
        System.out.println("2222222222.2 * 0.000001=" + new BigDecimal("2222222222.2").multiply(new BigDecimal("0.000001")));
//        System.out.println("2222222222.2f * 1111111111.1f=" + new BigDecimal("2222222222.2f").multiply(new BigDecimal("1111111111.1f")));
        System.out.println("222222222+1111111111=" + (new BigDecimal("222222222").add(new BigDecimal("1111111111"))));
        System.out.println("2222222222.2-1111111111=" + (new BigDecimal("2222222222.2").subtract(new BigDecimal("1111111111"))));
        System.out.println("2222222222.2/2=" + new BigDecimal("2222222222.2").divide(new BigDecimal("2")).toString());

    }
}
