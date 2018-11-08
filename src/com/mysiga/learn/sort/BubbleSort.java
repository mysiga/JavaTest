package com.mysiga.learn.sort;

/**
 * BubbleSort,冒泡排序
 */
public class BubbleSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            throw new NullPointerException("array is not null");
        }
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for ( j = i - 1; j >= 0; j--) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 2, 5, 8, 9};
        array = BubbleSort.sort(array);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : array) {
            stringBuilder.append(i).append(",");
        }
        System.out.println(stringBuilder.toString());
    }
}
