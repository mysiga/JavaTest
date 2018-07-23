package com.mysiga.learn.adapter;

/**
 * 适配器模式:实现两个类：A类，B类，最终成C类，同时适配A，B类
 */
public class AdapterTest {
    public static void main(String[] args) {
        AdapterClass adapterClass=new AdapterClass();
        BaseAdapter baseAdapter=new BaseAdapter();
        AdaperObject adaperObject=new AdaperObject(baseAdapter);
    }
}
