package org.example;


import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static int majorityElement(int[] nums) {
        Map <Integer,Integer> groups = new HashMap<>();
        int max = 0;
        int res = 0;
        for(int num : nums) {
            if(!groups.containsKey(num)) {
                groups.put(num, 0);

            }
            groups.put(num,groups.get(num)+1);

            if(groups.get(num) > max) {
                max = groups.get(num);
                res = num;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] intervals = new int[]{5,1,1,1,2,2,3,3,3,3};

        System.out.println(majorityElement(intervals));


    }
}