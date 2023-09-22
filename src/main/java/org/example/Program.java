package org.example;

import java.util.*;


public class Program {
//217. Contains Duplicate
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4};
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        if (nums.length > set.size()) System.out.println(true);
        else System.out.println(false);
    }

}