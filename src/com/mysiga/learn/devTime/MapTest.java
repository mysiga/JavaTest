package com.mysiga.learn.devTime;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Wilson on 2018/10/31.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        Map<String, Integer> treemap = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            hashmap.put("key"+i, i);
            treemap.put("key"+i, i);
        }
        System.out.println(hashmap.toString());
        System.out.println(treemap.toString());

    }
}
