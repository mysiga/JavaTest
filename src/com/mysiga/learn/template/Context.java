package com.mysiga.learn.template;

/**
 * Created by Wilson on 2017/3/25.
 */
public class Context {
    private AbstractTemplate template;

    public Context(AbstractTemplate template) {
        this.template = template;
    }

    public void sortArray(int[] array) {
        template.sortResult(array);
    }
}
