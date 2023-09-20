package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.concurrent.Semaphore;

import java.util.concurrent.Phaser;

public class Program {

    public static void main(String[] args) {

        int[] nums1 = new int[]{4,9};
        int[] nums2 = new int[]{9,4,9};

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if ((nums1[i] == nums2[j]) && (!list.contains(nums1[i]))) {
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        int[] res = new int[list.size()];
        int i=0;
        for (Integer lis: list) {
            res[i] = lis;
            i++;
        }

        System.out.println(res);
    }
}