package basic;

public class FirstOccurnce {
    public static int firstoccurance(int arr[] ,int i , int key){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstoccurance(arr,i+1,key);
    }

    public static void main(String[] args) {
        int[] arr ={3,5,32,6,7,4,3,74};
        System.out.println(firstoccurance(arr,0,4));
    }
}
