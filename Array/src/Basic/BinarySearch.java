package Basic;

import java.util.Arrays;

public class BinarySearch {
    public static int Binsearch(int arr[] ,int target){
        int n = arr.length;
        Arrays.sort(arr);
        int start =0;
        int end = arr.length-1;
         while (start <= end ){
             int mid = (start+end)/2;

             // campairs
             if(arr[mid]==target){
                 return mid;
             }
             if(arr[mid]<target){
                 start = mid+1;
             }
             else{
                 end = mid-1;
             }
         }
         return -1;
    }

    public static void main(String[] args) {
        int[] arr ={2,4,1,5,8,3,31,90,34};
        int target = 8;
        int res = Binsearch(arr,target);
        System.out.println(res);

        for(int i = 0 ;i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
