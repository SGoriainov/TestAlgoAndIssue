package org.example;


import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static List<List<String>> groupWords(String[] words) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(word);
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> group : groups.values()) {
            group.sort(null);
            result.add(group);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedWords = groupWords(words);
        for (List<String> group : groupedWords) {
            System.out.println(group);
        }
    }
}