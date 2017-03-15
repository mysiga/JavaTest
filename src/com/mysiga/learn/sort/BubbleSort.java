package com.mysiga.learn.sort;

/**
 * BubbleSort,冒泡排序
 */
public class BubbleSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            throw new NullPointerException("array is not null");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 2, 5, 8, 9};
        array = BubbleSort.sort(array);
        System.out.println(array.toString());
    }
}
