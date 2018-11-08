package com.mysiga.learn.test;

/**
 * Created by Wilson on 2017/8/15.
 */
public class Person {
    private Year year;
    private int glide;

    public Year getYear() {
        return year;
    }

    public int getGlide() {
        return glide;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[j] + nums[i]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Person person = new Person();
        if (person.getYear() == null) {
            System.out.println("person.getYear() == null");
        } else {
            System.out.println("person.getYear() != null");
        }
        int[] test = {-3, 4, 3, 8};
        System.out.println("输出：" + person.twoSum(test, 0).toString());


    }

}
