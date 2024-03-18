package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Solution {
    public static int buildArray(String string) {
        char ch;
        int res = 0;
        for (int i = 0; i < string.length(); i++) {

            res = res * 10 + (string.charAt(i) - '0');
        }
        return res;
    }

    public static void main(String[] args) {

        String st = "233";
        //char operations = 'e';
        //String[] operations2 = new int[] {"0,2,1,5,3,4"};

        System.out.println(buildArray(st));

    }
}


