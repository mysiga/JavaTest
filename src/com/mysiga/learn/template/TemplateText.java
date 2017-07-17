package com.mysiga.learn.template;

/**
 * 模板设计模式：抽象类{@link AbstractTemplate},具体子类{@link MaxTemplate}和{@link MinTemplate}
 */
public class TemplateText {
    public static void main(String[] args) {
        Context context = new Context(new MaxTemplate());
        int[] array = {1, 2, 3, 6, 4, 5, 9};
        context.sortArray(array);
    }
}
