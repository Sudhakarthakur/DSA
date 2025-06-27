package basic;

public class ArratisSorted {
    public static boolean IsSorted(int[] arr , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return IsSorted(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,34,6,7,8};
        System.out.println(IsSorted(arr,0));
    }
}
