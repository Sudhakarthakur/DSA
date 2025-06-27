package basicSorting;

import java.util.Arrays;
import java.util.Collections;

public class Inbulitfunction {
    public static void main(String[] args) {
        int arr[] = {2, 8, 4, 6, 3, 1, 0};
        // for assending order sorted
//        Arrays.sort(arr);
        // for a part of array
        Arrays.sort(arr,0,5);

        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

//        for reverse order
        // it hold collection
        Integer ar[] = {2, 8, 4, 6, 3, 1, 0};
        Arrays.sort(ar, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ar[i]+ " ");
        }
    }
}
