package org.example;


import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static int maxOnesLength(int[] nums) {
        int maxOnesLength = 0;
        int startOnesIndex = 0;
        int onesCounter =0;
        int zerosCounter = 0;
        int secondOnesIndex =0;

        for (int i = 0; i < nums.length; i++) {
            if( nums[i] ==1 && startOnesIndex ==0) { //если у нас начало последовательности единиц
                startOnesIndex = i;
                onesCounter++;
            } else if (nums[i]==1) { //считаем последоватьность единиц
                onesCounter++;
            } else if (nums[i] == 0 && startOnesIndex !=0) {//если мы встретили 0 в последоватльности
                zerosCounter++;
                if (zerosCounter==2) {//если в последовательности единиц мы встречаем второй ноль
                    zerosCounter--;
                    maxOnesLength = Math.max(maxOnesLength,onesCounter+1);
                    startOnesIndex =secondOnesIndex;
                    onesCounter = nums[i]-secondOnesIndex;
                    secondOnesIndex=0;
                }
                //если после 0 в последовательности идет 1, то запоминаем индекс второй последовательности
            } else if (nums[i]==1 && zerosCounter ==1 && secondOnesIndex ==0) {
                secondOnesIndex = i;
            } else if (nums[i]==0) { //если идут нули
                startOnesIndex =0;
                zerosCounter =0;
                secondOnesIndex =0;
                onesCounter =0;
            }
        }

        return Math.max(maxOnesLength,onesCounter);
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1};
        System.out.println(maxOnesLength(nums)); // Output should be 4
    }
}
