package com.mysiga.learn.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * java vm contact pool oom
 */
public class RuntimeContactOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
