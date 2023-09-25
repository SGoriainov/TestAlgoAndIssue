package org.example;

import java.util.*;


public class Program {
//53. Maximum Subarray. Using Kadane
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, -5, 1, 2, 3};

        int currValue =0;
        int bestValue =0;

        for (int i = 0; i < nums.length; i++) {
            currValue = currValue + nums[i];
            if (currValue < 0) currValue = 0;

            if (currValue > bestValue) bestValue = currValue;
        }
        System.out.println(bestValue);
    }
}