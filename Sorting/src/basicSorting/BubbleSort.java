package basicSorting;

public class BubbleSort {
//    public static void bublesort(int[] arr){
//        int l = arr.length;
//        for(int i=0;i<l-1;i++) {
//            for (int j = 0; j < l -1- i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for(int i= 0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }


//    class Solution {
        public static void sortColors(int[] nums) {
            for(int j=0; j<nums.length-1; j++)
                for(int i=0; i<nums.length-1-i ;i++){
                    if(nums[i] > nums[i+1]){
                        int temp = nums[i];
                        nums[i] = nums[i+1];
                        nums[i+1] = temp;
                    }
                }
            for(int i=0; i<nums.length; i++){
                System.out.print(nums[i]+" ");
            }
        }
//    }

    public static void main(String[] args) {
     int[] arr= {2,0,2,1,1,0};
     sortColors(arr);

    }
}
