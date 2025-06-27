package basic;

public class LastOccurence {
    public static int lastOccurence(int[] arr , int i , int key){
        if(i == arr.length-1){
            return -1;
        }
        int Isfound = lastOccurence(arr,i+1,key);
        if(Isfound == -1 && arr[i] == key){
            return i;
        }
        return Isfound;
    }

    public static void main(String[] args) {
        int[] arr ={3,4,6,7,8,2,3,5};
        System.out.println(lastOccurence(arr,0,3));
    }
}
