package org.example;


import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static String setToGroup(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        list.add(list.get(list.size() - 1));
        System.out.println(list);
        // "0-5,8-9,11"

        StringBuilder result = new StringBuilder(String.valueOf(list.get(0)));
        int startGroup = 0;
        int endGroup = 0;
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            startGroup = list.get(i + 1);
            endGroup = list.get(i);
            if ((startGroup > endGroup + 1) && (count == 1)) {
                result.append("," + startGroup);
                count = 0;
            } else if (list.get(i + 1) > list.get(i) + 1) {
                result.append("-" + endGroup + "," + startGroup);
                count = 0;
            }
            count++;
        }
        result.append("-"+list.get(list.size()-1));
        return String.valueOf(result);
    }


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(2, 3, 4, 6, 8, 9, 10));

        System.out.println(setToGroup(set));
    }
}
