package org.example;

import java.util.*;


public class Program {
//33. Search in Rotated Sorted Array
    public static void main(String[] args) {

        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target =3 ;


        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}