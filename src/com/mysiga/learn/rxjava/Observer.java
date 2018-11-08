package com.mysiga.learn.rxjava;

/**
 * Created by Wilson on 2018/8/26.
 */
public interface Observer<T> {
    void completed();

    void onError(Throwable t);

    void onNext(T var1);
}
