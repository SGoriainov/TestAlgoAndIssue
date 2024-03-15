package org.example;

import java.util.*;


public class Solution {
    public static String defangIPaddr(String address) {

        String newAdress = address.replaceAll("\\.", "[,]");
    return newAdress;
    }

    public static void main(String[] args) {

        String operations = "1.1.1.1";

        System.out.println(defangIPaddr(operations));

    }
}


