package org.example;

import java.util.*;


public class Program {
//1. Two Sum
    public static void main(String[] args) {

        public int[] countBits ( int num){
            int[] f = new int[num + 1];
            for (int i = 1; i <= num; i++) f[i] = f[i >> 1] + (i & 1);
            return f;
        }
    }
}