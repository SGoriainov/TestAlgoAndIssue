package org.example;

import java.util.*;


public class Program {
//152. Maximum Product Subarray
    public static void main(String[] args) {

        int[] nums = new int[]{-2,0,-1};

        int min = nums[0];
        int max = nums[0];
        int res=nums[0];

        for (int i=1; i<nums.length; i++) {

            int temp = max * nums[i];

            max = Integer.max(nums[i],(Integer.max(nums[i]*min, nums[i]*max)));
            min = Integer.min(nums[i],(Integer.min(nums[i]*min, temp)));
            res = Integer.max(res,max);
        }
        System.out.println(res);
    }
}