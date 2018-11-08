package com.mysiga.learn.adapter;

/**
 * Created by Wilson on 2018/8/8.
 */
public interface ScoreOperation {
    /**
     * 成绩排序
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array);

    /**
     * 成绩查找
     *
     * @param array
     * @param key
     * @return
     */
    public int search(int[] array, int key);
}
