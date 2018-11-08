package com.mysiga.learn.devTime;

/**
 * Created by Wilson on 2018/10/28.
 */
public class LinearSort {
    public static void main(String[] args) {
        int[] textArr = {1, 3, 5, 2, 6, 2, 3};
        countSort(textArr);
        for (int i = 0; i < textArr.length; i++) {
            System.out.print(textArr[i]+"\t");
        }
    }

    /**
     * 计数排序
     *
     * @param sort
     */
    public static void countSort(int[] sort) {
        int length = sort.length;
        if (length <= 1) {
            return;
        }
        int max = 0;
        for (int i = 0; i < length; i++) {
            if (max < sort[i]) {
                max = sort[i];
            }
        }
        int[] tempCount = new int[max + 1];
        for (int i = 0, lengthTemp = tempCount.length; i < lengthTemp; i++) {
            tempCount[i] = 0;
        }
        for (int i = 0; i < length; i++) {
            tempCount[sort[i]]++;
        }
        for (int i = 1, lengthTemp = tempCount.length; i < lengthTemp; i++) {
            tempCount[i] = tempCount[i - 1] + tempCount[i];
        }
        //重点
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            int index = tempCount[sort[i]] - 1;
            temp[index] = sort[i];
            tempCount[sort[i]]--;
        }
        for (int i = 0; i < length; i++) {
            sort[i] = temp[i];
        }

    }

}
