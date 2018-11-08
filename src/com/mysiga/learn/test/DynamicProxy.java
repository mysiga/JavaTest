package com.mysiga.learn.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Wilson on 2018/10/10.
 */
public class DynamicProxy implements InvocationHandler {
    private IProxy mProxy;

    public DynamicProxy(IProxy mProxy) {
        this.mProxy = mProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(mProxy, args);
    }

    public static void main(String[] args) {
        NameProxy nameProxy = new NameProxy();
        DynamicProxy dynamicProxy = new DynamicProxy(nameProxy);
        IProxy mproxy = (IProxy) Proxy.newProxyInstance(IProxy.class.getClassLoader(), new Class[]{IProxy.class}, dynamicProxy);
        mproxy.getName();
    }
}