package com.mysiga.learn.template;

/**
 * Created by Wilson on 2017/3/25.
 */
public class MaxTemplate extends AbstractTemplate {
    @Override
    int[] sort(int[] array) {
        System.out.println("从大到小排列");
        return array;
    }
}
