package com.mysiga.learn.devTime;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Wilson on 2018/10/30.
 */
public class SkipList {
    public static final int MAX_LEVEl = 16;
    private int levelCount = 1;

    private Node head = new Node();
    private Random r = new Random();

    public Node find(int value) {
        Node p = head;
        for (int i = levelCount - 1; i >= 0; --i) {
            while (p.forwords[i] != null && p.forwords[i].data < value) {
                p = p.forwords[i];
            }
        }
        if (p.forwords[0] != null && p.forwords[0].data == value) {
            return p.forwords[0];
        } else {
            return null;
        }
    }

    public void insert(int value) {
        int level = randomLevel();
        Node newNode = new Node();
        newNode.data = value;
        newNode.maxLevel = level;
        Node update[] = new Node[level];
        for (int i = 0; i < level; i++) {
            update[i] = head;
        }
        Node p = head;
        for (int i = level - 1; i >= 0; i--) {
            while (p.forwords[i] != null && p.forwords[i].data < value) {
                p = p.forwords[i];
            }
            update[i] = p;
        }
        for (int i = 0; i < level; i++) {
            newNode.forwords[i] = update[i].forwords[i];
            update[i].forwords[i] = newNode;
        }
        if (levelCount < level) {
            levelCount = level;
        }
    }

    private int randomLevel() {
        int level = 1;
        for (int i = 0; i < MAX_LEVEl; i++) {
            if (r.nextInt() % 2 == 1) {
                level++;
            }
        }
        return level;
    }

    public void printAll() {
        Node p = head;
        while (p.forwords[0] != null) {
            System.out.println(p.forwords[0] + "  ");
            p = p.forwords[0];
        }
        System.out.println();
    }

    public class Node {
        private int data = -1;
        private Node[] forwords = new Node[MAX_LEVEl];
        public int maxLevel = 0;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", forwords=" + Arrays.toString(forwords) +
                    ", maxLeven=" + maxLevel +
                    '}';
        }
    }

}
