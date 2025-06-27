package basicSorting;

import java.util.Collections;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // find out the correct postion to insert
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
        for(int i =0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,3,2,7,4,8,1};
        insertionSort(arr);

        // inbulit java soeted function
        // for assending order
        // Arrays.sort(arr);
        // for reverse order
//        Arrys.sort(arr, Collections.reverseOrder())

//        for a particular part of arr
//          Arrays.sort(arr,SI,EI);
    }
}
