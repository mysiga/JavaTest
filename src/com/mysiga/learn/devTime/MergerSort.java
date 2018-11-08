package com.mysiga.learn.devTime;

/**
 * Created by Wilson on 2018/10/27.
 */
public class MergerSort {
    public static void main(String[] args) {
        int[] sort = {1, 2, 4, 3, 5, 6, 4};
        mergeSort(sort);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + "\t");
        }

    }

    public static void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    public static void sort(int[] data, int start, int end) {
        if (start < end) {
            int center = (end + start) / 2;
            sort(data, start, center);
            sort(data, center + 1, end);
            merge(data, start, center, end);
        }

    }

    public static void merge(int[] data, int start, int center, int end) {
        int[] tempArr = new int[data.length];
        int third = start;
        int temp = start;
        int mid = center + 1;
        while (mid <= end && start <= center) {
            if (data[start] <= data[mid]) {
                tempArr[third++] = data[start++];
            } else {
                tempArr[third++] = data[mid++];
            }
        }
        while (start <= center) {
            tempArr[third++] = data[start++];
        }
        while (mid <= end) {
            tempArr[third++] = data[mid++];
        }
        while (temp <= end) {
            data[temp]=tempArr[temp++];
        }
    }
}
