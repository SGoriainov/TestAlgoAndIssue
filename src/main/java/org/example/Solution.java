package org.example;


import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> maps= new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            if(maps.containsKey(nums[i])) {
                return true;
            } else {
                maps.put(nums[i],nums[i]);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] intervals = new int[]{1,2,3,1};



        containsDuplicate(intervals);


    }
}