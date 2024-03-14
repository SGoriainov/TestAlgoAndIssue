package org.example;

import java.util.*;


public class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        int x =0;
        for (int i=0; i<operations.length; i++) {
            //--X
            if (operations[i].charAt(0)=='-') {
                --x;
            }

            //X--
            if (operations[i].charAt(2)=='-') {
                --x;
            }

            //++X
            if (operations[i].charAt(0)=='+') {
                ++x;
            }

            //X++
            if (operations[i].charAt(2)=='+') {
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int res = 0;
        String[] operations = new String[]
                {"--X","X++","X++"};

        res = finalValueAfterOperations(operations);
        System.out.println(res);

    }
}


