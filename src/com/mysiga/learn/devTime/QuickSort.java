package com.mysiga.learn.devTime;

/**
 * Created by Wilson on 2018/10/28.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] sort = {1, 2, 4, 3, 5, 6, 4};
        quickSort(sort);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + "\t");
        }
        System.out.println("\n请数组中第K大元素，k=3");
        System.out.println(quickSortInternallyK(sort, 0, sort.length - 1, 3));


    }

    public static int quickSortInternallyK(int[] sort, int left, int right, int k) {
        if (left >= right) {
            return -1;
        }
        int temp = partition(sort, left, right);
        if (temp + 1 == k) {
            return sort[temp];
        } else if (temp + 1 > k) {
            return quickSortInternallyK(sort, left, temp - 1,k);
        } else {
            return quickSortInternallyK(sort, temp + 1, right,k);
        }

    }

    public static void quickSort(int[] sort) {
        quickSortInternally(sort, 0, sort.length - 1);
    }

    public static void quickSortInternally(int[] sort, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = partition(sort, left, right);
        quickSortInternally(sort, left, temp - 1);
        quickSortInternally(sort, temp + 1, right);
    }

    public static int partition(int[] sort, int left, int right) {
        int temp = sort[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (sort[j] < temp) {
                int tempSort = sort[i];
                sort[i] = sort[j];
                sort[j] = tempSort;
                i++;
            }
        }
        int tempChange = sort[i];
        sort[right] = tempChange;
        sort[i] = temp;
        return i;
    }
}
