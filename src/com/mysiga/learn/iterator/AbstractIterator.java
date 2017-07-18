package com.mysiga.learn.iterator;

/**
 * Created by Wilson on 2017/7/18.
 */
public interface AbstractIterator {
    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    Object getNextItem();
    Object getPreviousItem();
}
