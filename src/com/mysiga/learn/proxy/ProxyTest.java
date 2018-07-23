package com.mysiga.learn.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Wilson on 2017/3/25.
 */
public class ProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        //static proxy
        //StaticProxy proxy = new StaticProxy(realSubject);
        //proxy.Request();

        //dynamic proxy
        ProxyHandler handler = new ProxyHandler(realSubject);
        Subject subjectProxy = (Subject) Proxy.newProxyInstance(
                RealSubject.class.getClass().getClassLoader(), RealSubject.class.getInterfaces(),
                handler);
        subjectProxy.Request();
    }
}
