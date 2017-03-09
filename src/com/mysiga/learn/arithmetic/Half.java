package com.mysiga.learn.arithmetic;

/**
 * test half search
 */
public class Half {
    /**
     * half search index
     *
     * @param orderArray
     * @param value
     * @return
     */
    public static int halfSearch(int[] orderArray, int value) {
        int index = 0;
        int end = orderArray.length - 1;
        while (index <= end) {
            int middle = (end + index) / 2;
            if (orderArray[middle] == value) {
                return middle;
            } else if (orderArray[middle] > value) {
                end = middle - 1;
            } else {
                index = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] orderArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Half.halfSearch(orderArray, 10));
        System.out.println(Half.halfSearch(orderArray, 9));
        System.out.println(Half.halfSearch(orderArray, 6));
        System.out.println(Half.halfSearch(orderArray, 4));
        System.out.println(Half.halfSearch(orderArray, 3));
    }
}
