package org.example;

import java.util.*;


public class Program {
//1. Two Sum
    public static void main(String[] args) {

        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target =3 ;


        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] eresult = {0,0};

        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) != null) {
                int[] result = {map.get(nums[i])+1,i+1};
                return result;
            }
            map.put(target-nums[i], i);
        }
        return eresult;

    }
}