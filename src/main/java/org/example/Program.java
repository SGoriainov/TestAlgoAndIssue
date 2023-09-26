package org.example;

import java.util.*;


public class Program {
//53. Maximum Subarray. Using Kadane
    public static void main(String[] args) {

        int[] nums = new int[]{-8, -3, -6, -2, -5, -4, 2, 0};

        int currValue =0;
        int bestValue =Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currValue = currValue + nums[i];
            if (currValue < nums[i]) currValue = nums[i];

            if (currValue > bestValue) bestValue = currValue;
        }
        System.out.println(bestValue);
    }
}