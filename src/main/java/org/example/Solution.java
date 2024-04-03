package org.example;


import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static int maxNumGuests(int[][] guests) {
        int res = 0;
        //{1, 2}, {1, 3}, {2, 4}, {2, 3}
        // для каждого дня посчитаем, сколько приехало и сколько отъехало
        Map<Integer, Integer> arriving = new HashMap<>();
        Map<Integer, Integer> leaving = new HashMap<>();
        //перебираем гостей, считаем сколько гостей прибыло и убыло в каждый из дней
        for (int[] guest : guests) {
            arriving.put(guest[0], arriving.getOrDefault(guest[0], 0) + 1);
            leaving.put(guest[1], leaving.getOrDefault(guest[1], 0) + 1);
        }

        int current = 0;
        //сколько у нас вобще дней с жильцами
        Set<Integer> days = new HashSet<>();
        days.addAll(arriving.keySet());
        days.addAll(leaving.keySet());

        // едем по дням в порядке увеличения, добавляем приехавших и убавляем уехавших,
        // считаем сколько стало
        List<Integer> sortedDays = new ArrayList<>(days);
        Collections.sort(sortedDays);

        //считаем сколько жильцов было в каждый из дней
        for (int day : sortedDays) {
            current -= leaving.getOrDefault(day, 0);
            current += arriving.getOrDefault(day, 0);
            if (current > res) {
                res = current;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        int[][] guests = {{1, 2}, {1, 3}, {2, 4}, {2, 3}};
        System.out.println(maxNumGuests(guests)); // Output should be 3
    }
}