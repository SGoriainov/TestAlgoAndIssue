package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Solution {




    public static void main(String[] args) {

        String str = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        //A4B3C2XYZD4E3F3A6B28
        String result = "";
        str += "x";
        //str= str.concat("x");
        System.out.println(str);
        int counter =1;

        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) counter++;
            else if (counter == 1) result= result.concat(String.valueOf(str.charAt(i)));
            else {
                result= result.concat(String.valueOf(str.charAt(i))+counter);
                counter =1;
            }
        }
        // Обработка последнего символа
        /*if (counter == 1) {
            result = result.concat(String.valueOf(str.charAt(str.length() - 1)));
        } else {
            result = result.concat(String.valueOf(str.charAt(str.length() - 1)) + counter);
        }*/
        System.out.println(result);
    }
}
