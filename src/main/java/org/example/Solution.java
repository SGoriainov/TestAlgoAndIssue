package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Solution {
    public static int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
            newArray[i]= nums[nums[i]];

        }
        return newArray;
    }

    public static void main(String[] args) {

        //char operations = 'e';
       int[] operations2 = new int[] {0,2,1,5,3,4};

        System.out.println( buildArray(operations2));

    }
}


