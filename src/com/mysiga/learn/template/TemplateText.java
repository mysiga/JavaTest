package com.mysiga.learn.template;

/**
 * Created by Wilson on 2017/3/25.
 */
public class TemplateText {
    public static void main(String[] args) {
        Context context = new Context(new MaxTemplate());
        int[] array = {1, 2, 3, 6, 4, 5, 9};
        context.sortArray(array);
    }
}
