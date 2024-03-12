package org.example;

import java.util.*;
/*int[][] keyValuePairs = {
                {1, -50, -25},
                {2, 0, 10},
                {3, 10, 15},
                {4, 0, 50},
                {5, -25, -25},
                {6, -25, 10},
                {7, 70, 100}
        };*/
// Перебор элементов массива
        /*for (int i = 0; i < keyValuePairs.length; i++) {
            int container = keyValuePairs[i][0];
            int value1 = keyValuePairs[i][1];
            int value2 = keyValuePairs[i][2];*/

public class ContainerDistribution {

    public static void main(String[] args) {
        int[][] containers = {
                {1, -50, -25},
                {2, 0, 10},
                {3, 10, 15},
                {4, 0, 50},
                {5, -25, -25},
                {6, -25, 10},
                {7, 70, 100}
        };
        Arrays.sort(containers, Comparator.comparingInt(c -> c[1]));
        List<List<Integer>> transports = new ArrayList<>();
        int currentTransportTemperature = Integer.MIN_VALUE;
        List<Integer> currentTransport = null;

        for (int[] container : containers) {
            // Если текущий контейнер не подходит для текущего транспорта,
            // создаем новый транспорт
            if (container[1] > currentTransportTemperature) {
                if (currentTransport != null) {
                    transports.add(currentTransport);
                }
                currentTransport = new ArrayList<>();
                currentTransportTemperature = container[2];
                currentTransport.add(transports.size()+1);
                currentTransport.add(container[2]); // Добавляем температуру транспорта
            }
            // Добавляем номер контейнера в текущий транспорт
            currentTransport.add(container[0]);
        }

        // Добавляем последний транспорт в список
        if (currentTransport != null) {
            transports.add(currentTransport);
        }

        for (List<Integer> transport : transports) {
            System.out.println(transport);
        }
    }
}


