package com.mysiga.learn;

import java.io.UnsupportedEncodingException;

/**
 * Created by Wilson on 2017/12/6.
 */
public class PieChart extends BaseChart {
    @Override
    public void display() {
        System.out.println("PieChart");
    }

    public static void main(String[] args) {
//        String str1="STRINGS";
//        String str2="Stringsa";
//        String str3="StringsABB";
//        System.out.println(str2.compareToIgnoreCase(str3));
//        String str1 = "";
//        String str2 = "我";
//        String str3 = "我A";
//        String str4 = "我A是AA是999";
//        System.out.println(getChinese(str1));
//        System.out.println(getChinese(str2));
//        System.out.println(getChinese(str3));
//        System.out.println(getChinese(str4));
//        System.out.println(Charset.defaultCharset());
        int[] array = {1, 2};
//        int[] array = {1, 5, 91, 11, -1, 224, 444};
//        int[] arraySort = bulleSort(array);
//        int[] arraySort = selectSort(array);
        int[] arraySort = insertSort(array);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arraySort.length; i++) {
            builder.append(String.valueOf(arraySort[i])).append(",");
        }

        System.out.println(builder.toString());
    }

    public static String getChinese(String name) {
        String nameUTF8 = null;
        try {
            nameUTF8 = new String(name.getBytes("UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        StringBuilder usa = new StringBuilder();
        if (nameUTF8.length() >= 3) {
            usa.append(nameUTF8.substring(1, 3));
        } else {
            usa.append(nameUTF8);
        }
        return usa.toString();
    }

    /**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    public static int[] bulleSort(int[] array) {
        int length = array.length;
        for (int i = length - 1; i > 0; i--) {
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

    public static int[] selectSort(int[] array) {
        for (int i = 0, length = array.length; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] insertSort(int[] array) {
        for (int i = 1, length = array.length; i < length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
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
}