package com.mysiga.learn.leetCode;

/**
 * Created by Wilson on 2018/9/12.
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2222, 111, -1, 10};
        int[] aray = twoSum(nums, 9);
        if (aray == null) {
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0, length = aray.length; i < length; i++) {
            builder.append(aray[i]).append(",");
        }
        System.out.println(builder.toString());
    }


    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0, length = nums.length; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
