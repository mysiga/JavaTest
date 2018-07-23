package com.mysiga.learn.adapter;

/**
 * 对象适配
 */
public class AdaperObject implements TargetInterface {
    private BaseAdapter adapter;

    public AdaperObject(BaseAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void method1() {
        adapter.methodAdapter();
    }

    @Override
    public void method2() {
        adapter.methodAdapter();
    }
}
