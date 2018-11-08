package com.mysiga.learn.leetCode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Wilson on 2018/10/30.
 */
public class StackString {
    public static void main(String[] args) {
        String test = "[()]";
        System.out.println(isValid(test));
    }

    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        HashMap<String, String> hash = new HashMap<>();
        hash.put(")", "(");
        hash.put("]", "[");
        hash.put("}", "{");
        String[] sub = s.split("");
        for (int i = 0; i < sub.length; i++) {
            String test = sub[i];
            stack.push(test);
            String path = hash.get(test);
            if (path != null) {
                int index = stack.search(path);
                if (index == -1) {
                    return false;
                } else {
                    stack.remove(test);
                    stack.remove(path);
                }
            }

        }

        return stack.isEmpty();
    }
}
