package Basic;

public class TotalPairs {
    public static void pair(int[] arr){
        for(int i=0;i< arr.length;i++){
            int curr = arr[i];
            for(int j =i+1;j< arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        pair(numbers);
    }
}
