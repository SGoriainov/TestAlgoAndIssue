package org.example;

import java.util.*;


public class Program {
//1. Two Sum
    public static void main(String[] args) {

        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target =3 ;


        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left+1, i+1};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}