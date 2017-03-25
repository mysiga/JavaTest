package com.mysiga.learn.proxy;

/**
 * static proxy class
 */
public class StaticProxy implements Subject {
    private Subject mSubject;

    public StaticProxy(Subject subject) {
        this.mSubject = subject;
    }

    @Override
    public void Request() {
        mSubject.Request();
    }
}
