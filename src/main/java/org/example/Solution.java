package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Solution {
    public static int [] getConcatenation(int[] nums) {
        int [] nums2 = Arrays.copyOf(nums, nums.length);
        return IntStream.concat(Arrays.stream(nums), Arrays.stream(nums2)).toArray();
        //return Arrays.toString(newArray);
    }

    public static void main(String[] args) {

        //char operations = 'e';
       int[] operations2 = new int[] {1,2,1};

        System.out.println( getConcatenation(operations2));

    }
}


