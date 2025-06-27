package Basic;

import java.util.Arrays;

public class LargestNo {
    public static int largestvalu(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        Arrays.sort(arr);
        for(int i=0 ;i<n-1 ;i++){
            if(arr[i]>arr[i+1]){
                return arr[i];
            } else{
                largest = arr[i+1];
            }
        }
        return largest;

        // print sorted arr
//
//        for(int i =0 ;i<n-1 ;i++){
//            System.out.println(arr[i]+" ");
//        }
    }
    public static void main(String[] args) {

        int[] arr ={2,4,1,5,8,3,31,90,34};
        int larges = largestvalu(arr);
        System.out.println(larges);
//        largestvalu(arr);
    }
}
