package org.example;


import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }
        //обязательно сортируем отрезки
        List<int[]> resultRanges = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[] lastRange = null;

        for (int[] rng : intervals) {
            //если текущий отрезок не пересекается с последним отрезком
            if (lastRange == null || rng[0] > lastRange[1]) {
                resultRanges.add(rng);
                lastRange = rng;
            } else {
                //пересекатеся с последним отрезком, присваиваем новое значение концу отрезка
                //значение в resultRanges автоматически обновляется, т.к ссылаются на одну ячейку памяти в массиве
                lastRange[1] = Math.max(rng[1], lastRange[1]);
            }
        }

        return resultRanges.toArray(new int[resultRanges.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {9, 12},
                {14, 17}
        };

        int[][] mergedIntervals = merge(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}