package Basic;

public class LinearSearch {
    public static int linersearch(int[] arr, int target){
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
      int[] arr ={2,4,1,5,8,3};
      int target = 3;
      int index = linersearch(arr,target);
      if (index == -1){
          System.out.println("Noumner in not found");
      }else{
          System.out.println("Number is at index : "+index);
      }
    }
}
