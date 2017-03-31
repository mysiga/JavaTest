package com.mysiga.learn.oom;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/**
 * directMemory oom test
 */
public class DirectMemoryOOM {
    public static final int MB = 1024 * 1024;

    public static void main(String[] args) {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = null;
        try {
            unsafe = (Unsafe) unsafeField.get(null);
            while (true) {
                unsafe.allocateMemory(MB);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
