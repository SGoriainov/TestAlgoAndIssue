package org.example;

import java.util.*;


public class Program {
//1. Two Sum
    public static void main(String[] args) {

        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target =3 ;


        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]) + 1, i + 1};
            else map.put(nums[i], i);
        }
        return null;

    }
}