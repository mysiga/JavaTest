package com.mysiga.learn.test;

import java.util.*;

/**
 * Created by Wilson on 2018/10/11.
 */
public class MyLink<E> {
    public static class Node<E> {
        public E e;
        public Node<E> last;
        public Node<E> next;

        public Node(Node<E> last, E e, Node<E> next) {
            this.e = e;
            this.last = last;
            this.next = next;
        }

    }

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public void add(E e) {
        Node<E> tempNode = last;
        Node<E> newNode = new Node<>(first, e, null);
        last = newNode;
        if (first == null) {
            first = newNode;
        } else {
            tempNode.next = newNode;
        }

        System.out.println("2" + last.e);
        System.out.println(e);
        size++;
    }

    public E get(int cout) {
        // TODO: 2018/10/11
        return null;
    }

    public int getSize() {
        return size;
    }

    public void remvoe(E e) {

    }

    public static void main(String[] args) {
//        MyLink<String> myLink = new MyLink();
//        myLink.add("1");
//        myLink.add("2");
//        myLink.add("3");
//        myLink.add("4");
        int n = 5;
//        System.out.println(n + "人最后一位标号为：" + getTag(n));
//        twoSum(new int[]{2, 8, 7, 10}, 9);
        getFirstChar("abbac");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static String getFirstChar(String str) {
        String[] chars = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.get(chars[i]);
            } else {
                map.put(chars[i], 0);
            }
        }
        System.out.println(chars);
        return "";
//        throw new IllegalArgumentException("No two sum solution");
    }
}
