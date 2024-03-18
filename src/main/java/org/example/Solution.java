package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Solution {
    public static int numIdenticalPairs(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        //String st = "233";
        //char operations = 'e';
        //String[] operations2 = new int[] {"0,2,1,5,3,4"};
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};

        System.out.println(numIdenticalPairs(nums));

    }
}


