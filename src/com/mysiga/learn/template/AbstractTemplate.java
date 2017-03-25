package com.mysiga.learn.template;

/**
 * Created by Wilson on 2017/3/25.
 */
public abstract class AbstractTemplate {

    abstract int[] sort(int[] array);

    public void sortResult(int[] array) {
        array = sort(array);
        StringBuilder stringBuilder = new StringBuilder(array.length);
        for (int i = 0, length = array.length; i < length; i++) {
            stringBuilder.append(String.valueOf(array[i]));
        }
        System.out.println(stringBuilder.toString());
    }
}
