package org.example;

import java.util.*;


public class Program {
//153. Find Minimum in Rotated Sorted Array
    public static void main(String[] args) {

        int[] nums = new int[]{3,4,5,1,2};

        for( int i=1; i< nums.length; i++) {
            if(nums[i]<= nums[i-1]) System.out.println(nums[i]);

        }
    }
}