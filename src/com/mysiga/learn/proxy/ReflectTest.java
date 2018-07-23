package com.mysiga.learn.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Wilson on 2018/7/23.
 */
public class ReflectTest {
    public static void main(String[] args) {
//        反射三种创建
//        1.对象获取
        ReflectObject object = new ReflectObject();
        Class class1 = object.getClass();
        System.out.println("class1=" + class1.getName());
//        2.类名
        Class class2 = ReflectObject.class;
        System.out.println("class2=" + class2.getName());
//        3.具体包名路径
        Class class3 = null;
        try {
            class3 = Class.forName("com.mysiga.learn.proxy.ReflectObject");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("class3=" + class3.getName());

//        获取成员方法Method
        StringBuilder methodBuilder = new StringBuilder();
        Method[] methods = class3.getDeclaredMethods();
//        Method[] methods = class3.getMethods();
        for (int i = 0; i < methods.length; i++) {
            methodBuilder.append(methods[i]).append("\n");

        }
        System.out.println("所有方法：" + methodBuilder.toString());

//                获取成员变量Field
        Field[] fields = class3.getFields();
        StringBuilder fieldBuilder = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            fieldBuilder.append(fields[i]).append(",");
        }
        System.out.println("所有成员变量：" + fieldBuilder.toString());
        Method method = null;
        try {
            method = class3.getMethod("addName", String.class, int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if (method != null) {
            try {
                try {
                    method.invoke(class3.newInstance(),"Java",12);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
//        获取构造函数Constructor
        StringBuilder constructorBuilder = new StringBuilder();
        Constructor<?>[] constructors = class3.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            constructorBuilder.append(constructors[i]).append(",");
        }
        System.out.println("所有构造方法：" + constructorBuilder.toString());
    }
}
