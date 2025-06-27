package Basic;

public class SumofSUbarray {
    public static void subsum(int[] arr){

        for(int i=0;i< arr.length;i++){
            int curr = i;
            int sum =0;
            for(int j =i;j< arr.length;j++){
                int end = j;
                sum = sum+arr[j];
                System.out.print(sum+"  ");
//                System.out.println();
            }
            System.out.println();
        }
    }

    // fin max sum of subarray
    public static void Maxsum(int[] arr){
        int sum =0;
        int maxsum = Integer.MIN_VALUE;

        for(int i =0 ;i<arr.length;i++){
            int start = i;
            for(int j =i;j< arr.length;j++){
                int end = j;
                 sum =0 ;
                for(int k=start;k<=end;k++){
                    sum = sum+arr[k];
                }
                System.out.println(sum+" ");
                if(maxsum < sum){
                    maxsum = sum;
                }
            }
        }
        System.out.println(maxsum+" ");
    }

    public static void main(String[] args) {
         int[] arr = {2,4,6,8,10};
//         subsum(arr);

        Maxsum(arr);
    }

}
