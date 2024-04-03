package org.example;


import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static int maxNumGuests(int[][] guests) {
        int maxGuests = 0;
        Map<Integer, Integer> guestsCount = new HashMap<>();

        for (int[] guest : guests) {
            guestsCount.put(guest[0], guestsCount.getOrDefault(guest[0], 0) + 1);
            guestsCount.put(guest[1] + 1, guestsCount.getOrDefault(guest[1] + 1, 0) - 1);
        }

        int currentGuests = 0;
        for (int day : guestsCount.keySet()) {
            currentGuests += guestsCount.get(day);
            maxGuests = Math.max(maxGuests, currentGuests);
        }

        return maxGuests;
    }

    public static void main(String[] args) {
        int[][] guests = {{1, 2}, {1, 3}, {2, 4}, {2, 3}};
        System.out.println(maxNumGuests(guests)); // Output should be 3
    }
}