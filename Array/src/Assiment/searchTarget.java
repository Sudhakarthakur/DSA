package Assiment;

import java.util.Arrays;

public class searchTarget {
    // first way
//    public static int FindTarget(int[] arr, int target){
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }

           // secand way
    public static int FindTarget3(int[] arr , int target, int left , int right){

        while (left <= right) {
            int mid = (left+right)/2;
            if(arr[mid] == target){
                return mid;
                // left half is sotred
            } else if (arr[left]<=arr[mid]) {
                // target lies in left hafe
                if(arr[left] <=target && target <= arr[mid]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
            else {   // right halft is sorted
                // target in half right
                if(arr[mid] < target && target <= arr[right]){
                    left=mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }

     // third wat
    public static int FindTarget1(int[] arr , int target, int left , int right){
//        Arrays.sort(arr);
        while (left <= right) {
            int mid = left+(right-1)/2;
            if(arr[mid] == target){
                return mid;
                // left half is sotred
            } else if (arr[mid] > target) {
                right = mid-1;
            }
            else {   // right halft is sorted//
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//
        System.out.println(FindTarget3(arr,1,0, arr.length-1));
    }

}
