package Assiment;

public class StockSellandBuy {
    public static int stock(int arr[]){
        int buy = arr[0];
        int profit = 0;
        for(int i=1; i< arr.length; i++){
            if(arr[i] > buy){
                profit = Math.max(arr[i]-buy,profit);
            }else {
                buy = arr[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(stock(arr));
    }
}
