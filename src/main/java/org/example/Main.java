package org.example;

import java.util.*;


public class Main {
    //55. Jump Game
    public static void main(String[] args) {
        public boolean canJump(int[] nums) {
            int reachable = 0;
            for(int i = 0; i < nums.length; i ++) {
                if(i > reachable) return false;
                reachable = Math.max(reachable, i + nums[i]);
            }
            return true;
        }
    }
}
