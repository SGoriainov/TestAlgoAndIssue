package org.example;

import java.util.*;


public class Program {
//217. Contains Duplicate
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 5};
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                sum = sum * nums[j];
            }
            result[i] = sum;
        }

    }

}