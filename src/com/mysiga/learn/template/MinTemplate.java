package com.mysiga.learn.template;

/**
 * Created by Wilson on 2017/3/25.
 */
public class MinTemplate extends AbstractTemplate {
    @Override
    int[] sort(int[] array) {
        System.out.println("从小到大排列");
        return array;
    }
}
