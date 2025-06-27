package Basic;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i =n-1;i>0;i--){
            System.out.print(arr[i]+" ");
        }

    }

    // using swap methode
    public static void reveseswap(int[] arr){
        Arrays.sort(arr);
        int first =0 ,last = arr.length-1;

        while (first<last){
            //swap
            int temp =arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;

        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr ={2,4,1,5,8,3,31,90,34};
//        reverse(arr);

        System.out.println();
        reveseswap(arr);


    }
}
