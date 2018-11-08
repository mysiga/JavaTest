package com.mysiga.learn.devTime;

/**
 * Created by Wilson on 2018/10/30.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] binary = {1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9};
        int searchValue = 4;
        System.out.println("查找第一个值等于" + searchValue + "的元素位置:" + searchEqual(binary, searchValue));
        System.out.println("查找最后一个值等于" + searchValue + "的元素位置:" + searchLastEqual(binary, searchValue));
        System.out.println("查找第一个大于" + searchValue + "的元素位置:" + searchGreater(binary, searchValue));
        System.out.println("查找最后一个小于" + searchValue + "的元素位置:" + searchLess(binary, searchValue));
    }

    public static int searchEqual(int[] a, int value) {
        int length = a.length;
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if ((mid == 0) || (a[mid - 1] != value)) {
                    return mid;
                } else {
                    high = mid - 1;
                }

            }
        }
        return -1;
    }

    public static int searchLastEqual(int[] a, int value) {
        int length = a.length;
        int low = 0;
        int hight = length - 1;
        while (low <= hight) {
            int mid = low + (hight - low) / 2;
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                hight = mid - 1;
            } else {
                if (a[mid + 1] != value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int searchGreater(int[] a, int value) {
        int length = a.length;
        int low = 0;
        int hight = length - 1;
        while (low <= hight) {
            int mid = low + (hight - low) / 2;
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                hight = mid - 1;
            } else {
                if (a[mid + 1] != value) {
                    //已经排序的数组，最后一位等于4的后一位为大于指定值
                    return mid + 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int searchLess(int[] a, int value) {
        int length = a.length;
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == 0 || (a[mid - 1] != value)) {
                    return mid - 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
