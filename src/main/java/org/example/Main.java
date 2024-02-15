package org.example;

import java.util.*;


public class Main {
    //406. Queue Reconstruction by Height
    public static void main(String[] args) {
        public int[][] reconstructQueue(int[][] people) {
            Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

            List<int[]> ordered = new LinkedList<>();
            for (int[] p: people) ordered.add(p[1], p);

            return ordered.toArray(new int[people.length][2]);
        }
    }
}
