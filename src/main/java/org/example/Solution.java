package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target) {
                res.add(i);
            }
        }
        return res;

    }

    public static void main(String[] args) {

        //String st = "233";
        //char operations = 'e';
        //String[] operations2 = new int[] {"0,2,1,5,3,4"};
        int target = 2;
        int[] operations2 = new int[] {1,2,5,2,3};
        //int[][] nums = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        System.out.println(targetIndices(operations2,target));

    }
}


