package org.example;

import java.util.*;


public class Solution {
    public static int minPartitions(String n) {

        char[] ch = n.toCharArray();
        int max = Integer.MIN_VALUE;
        int charToInt = 0;
        for (int i = 0; i < ch.length; i++) {
            charToInt = Character.getNumericValue(ch[i]);
            if (charToInt == 9) return charToInt;
            if (charToInt > max) {
                max = charToInt;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        String operations = "27346209830709182346";

        System.out.println(minPartitions(operations));

    }
}


