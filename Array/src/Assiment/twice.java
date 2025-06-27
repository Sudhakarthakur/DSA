package Assiment;

import java.util.HashSet;

public class twice {
    public static boolean findtwice(int[] arr){
        int n =arr.length;
        for(int i=0; i<n; i++){
            int CurrNo = arr[i];
            for(int j=i+1; j<n;j++){
                if(CurrNo == arr[j])
                    return true;
            }
        }
        return false;
    }

    // using hashset

    public static boolean containDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            if(set.contains(arr[i])) {
                return true;
            }else {
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3};
        System.out.println(findtwice(arr));

        System.out.println(containDuplicate(arr));
    }
}
