package com.mysiga.learn.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 */
public class IteratorTest {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("因天降1");
        products.add("因天降2");
        products.add("因天3");
        products.add("因天降4");
        products.add("因天降5");

        AbstractObjectList list = new ProductList(products);
        AbstractIterator iterator = list.createIterator();

        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem() + ",");
            iterator.next();
        }
        System.out.println();
        System.out.println("----------------------");
        System.out.println("逆向遍历");
        while (!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem() + ",");
            iterator.previous();
        }

    }
}
