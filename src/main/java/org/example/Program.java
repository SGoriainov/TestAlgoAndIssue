package org.example;

import java.util.*;


public class Program {
//121. Best Time to Buy and Sell Stock
    public static void main(String[] args) {

        int[] prices = new int[] {2,4,1};
        int min= Integer.MAX_VALUE;
        int profitToday=0;
        int bestProfit =0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profitToday = prices[i] - min;
            if( profitToday > bestProfit ){
                bestProfit = profitToday;
            }
        }
        System.out.println(bestProfit);
    }
}