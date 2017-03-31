package com.mysiga.learn.sort;

/**
 * BubbleSort,冒泡排序
 */
public class BubbleSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            throw new NullPointerException("array is not null");
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
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
