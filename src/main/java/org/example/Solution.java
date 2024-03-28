package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Solution {




    public static void main(String[] args) {

        //String st = "233";
        //char operations = 'e';
        //String[] operations2 = new int[] {"0,2,1,5,3,4"};
        //int target = 2;
        //int[] operations2 = new int[] {1,2,5,2,3};
        //int[][] nums = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        //System.out.println(targetIndices(operations2,target));

        int[] arr1 = {1, 2, 3, 2, 0};
        int[] arr2 = {5, 1, 2, 7, 3, 2};

        int[] result = findIntersection(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        // Заполнение хэш-таблицы уникальными элементами из первого массива
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Поиск элементов из второго массива в хэш-таблице
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Преобразование списка в массив
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }
}

