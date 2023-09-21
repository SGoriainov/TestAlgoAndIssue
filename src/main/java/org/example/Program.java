package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Program {
//1365. How Many Numbers Are Smaller Than the Current Number
    public static void main(String[] args) {

        int[] nums = new int[] {8,1,2,2,3};
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) count++;
            }
            result[i]=count;
        }
        System.out.println(Arrays.toString(result));
    }
}