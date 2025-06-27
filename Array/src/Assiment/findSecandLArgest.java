package Assiment;

import java.util.Arrays;

public class findSecandLArgest {
    public static int revese(int[] arr){     // using reverse methode
        int n = arr.length;                 // O(n*log(n)) time
        int secandlargest = -1;
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--) {
            if (arr[i] != arr[n - 1]) {
              return arr[i];
            }
        }
       return -1;
    }

    public static int getsecLag(int[] arr){    // using transer value
        int n = arr.length;     // O(n*n)times
//        Arrays.sort(arr);
        int secanlargest = -1 , largest = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                secanlargest = largest;
                largest = arr[i];
            } else if (arr[i]>secanlargest && arr[i] != largest) {
                secanlargest = arr[i];
            }
        }
        return secanlargest;
        }
    public static void main(String[] args) {
        int arr[] = {2,9,4,6,15,22};
        System.out.println(getsecLag(arr));
    }
}
