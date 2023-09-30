package org.example;

import java.util.*;


public class Program {
//153. Find Minimum in Rotated Sorted Array
    public static void main(String[] args) {

        int[] nums = new int[]{3,4,5,1,2};

        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(nums[high] < nums[mid]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }

    }
}