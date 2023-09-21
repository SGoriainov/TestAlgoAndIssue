package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Program {
//2824. Count Pairs Whose Sum is Less than Target
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-6,2,5,-2,-7,-1,3);
        int target = -2;
        int count = 0;

        for (int i = 0; i <nums.size(); i++) {
            for (int j = i+1; j <nums.size(); j++) {
                if ((nums.get(i)+nums.get(j)) < target) {
                    count++;
                    System.out.println(nums.get(i)+" + " + nums.get(j)+ " == " + (nums.get(i)+nums.get(j)));
                }
            }
        }
        System.out.println(count);
    }
}