package Basic;

public class RappingRainWater {
    public static int trapwater(int[] arr){
        int n = arr.length;
        // calculate left max boundary - array
        int[] leftmax = new int[n];
        leftmax[0] = arr[0];
        for(int i =1;i<n;i++){
            leftmax[i] = Math.max(arr[i],leftmax[i-1]);
        }
        // calculate right max boundary - array
        int[] rightmax = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }
        int trapwater = 0;
        //loop
        for(int i = 0 ; i < n ; i++){
            // water level = min(leftmax bound , rightmax bound)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);

            // trap water += waterlevel - arr[i];
            trapwater = (trapwater+waterlevel) - arr[i];
        }
        return trapwater;

    }
    public static int waterstore(int[] arr){
        int h = arr.length;

        int maxwater = 0;
        int low =0 ;
        int high = h-1;

        while (low < high){
            int width = high-low;
            int minHight = Math.min(arr[low] , arr[high]);
            maxwater = Math.max(maxwater , width*minHight);

            if(arr[low]<arr[high]){
                low++;
            }else {
                high--;
            }
        }
        return maxwater;

    }

    public static void main(String[] args) {
        int[] hight = {4,2,0,6,3,2,5};
        System.out.println(waterstore(hight));
        System.out.println(trapwater(hight));
    }
}
