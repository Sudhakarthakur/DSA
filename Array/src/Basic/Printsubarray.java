package Basic;

public class Printsubarray {
      public static void subarr(int arr[]){
          for(int i=0;i< arr.length;i++){
              int curr = i;
              for(int j =i;j< arr.length;j++){
                  int end = j;
                  for(int k =curr;k<=end;k++){
                      System.out.print(arr[k]+" ");
                  }
                  System.out.println();
              }
              System.out.println();
          }

      }
    public static void main(String[] args) {
            int[] arr = {2,4,6,8,10};
            subarr(arr);

    }
}
