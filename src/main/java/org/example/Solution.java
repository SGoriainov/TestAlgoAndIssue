package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Solution {
    public static int countNegatives(int[][] grid) {
        int[] singleArr = Arrays.stream(grid)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();

        int res = singleArr.length;

        for (int i = 0; i < singleArr.length; i++) {
            if (singleArr[i] >= 0) {
                res = i;
                break;
            }
        }

        return res;

    }

    public static void main(String[] args) {

        //String st = "233";
        //char operations = 'e';
        //String[] operations2 = new int[] {"0,2,1,5,3,4"};
        int[][] nums = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        System.out.println(countNegatives(nums));

    }
}


