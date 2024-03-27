package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Solution {




    public static void main(String[] args) {

        //String st = "233";
        //char operations = 'e';
        //String[] operations2 = new int[] {"0,2,1,5,3,4"};
        //int target = 2;
        //int[] operations2 = new int[] {1,2,5,2,3};
        //int[][] nums = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        //System.out.println(targetIndices(operations2,target));

            int[] arr1 = {1, 2, 3, 2, 0};
            int[] arr2 = {5, 1, 2, 7, 3, 2};

            int[] result = findIntersection(arr1, arr2);
            System.out.println(Arrays.toString(result));
        }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int intersectionIndex = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersection[intersectionIndex++] = arr1[i];
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(intersection, intersectionIndex);
        }
    }


