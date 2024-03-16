package org.example;

import java.util.*;


public class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        int res =0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {

                if(String.valueOf(jewels.charAt(j)).equals(String.valueOf(stones.charAt(i)))) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        String operations = "ZZ";
        String operations2 = "z";

        System.out.println(numJewelsInStones(operations2,operations));

    }
}


