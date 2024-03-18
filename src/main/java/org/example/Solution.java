package org.example;

import java.util.*;


public class Solution {
    public static List<Integer> findWordsContaining(String[] words, char x) {

        List <Integer> listWord = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x))) {
                listWord.add(i);
            }
        }
        return listWord;
    }

    public static void main(String[] args) {

        char operations = 'e';
        String[] operations2 = new String[] {"leet","code"};

        System.out.println(findWordsContaining(operations2,operations));

    }
}


