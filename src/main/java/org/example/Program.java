package org.example;

import java.util.*;


public class Program {
//33. Search in Rotated Sorted Array
    public static void main(String[] args) {

        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target =3 ;

        int low = 0;
        int high = nums.length-1;

        while(low<=high) {
            int mid = low+(high-low) /2;

            if(nums[mid]==target) {
                System.out.println(mid);
                break;
            }
            if(nums[low] <= nums[mid]) {
                if(target >= nums[low] && target <nums[mid]) high = mid-1;
                else low = mid+1;
            }
            if(nums[high] >= nums[mid]) {
                if (target <= nums[high] && target > nums[mid]) low = mid+1;
                else high = mid-1;
            }
            System.out.println("mid =" +mid +"   low= "+low+"   high="+high);
        }

    }
}