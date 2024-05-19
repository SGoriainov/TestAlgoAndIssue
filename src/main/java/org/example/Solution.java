package org.example;


import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static boolean isAnagram(String s, String t) {
        //Map<String,String> stringMap = new HashMap<>();
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        String Ss= new String(charS);
        String Tt= new String(charT);
        if(Ss.equals(Tt)) return true;
        return false;
    }


    public static void main(String[] args) {
        //int[] intervals = new int[]{5,1,1,1,2,2,3,3,3,3};
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));


    }
}