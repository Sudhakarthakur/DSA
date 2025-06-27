package Basic;

public class findmaxsum {
    // find max sum of subarrays using prfix
    // methode

    public static void prefixMax(int[] arr){
        int Currsum =0;
        int maxsum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix array
        for(int i =1  ;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int  i =0 ;i< arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end =j;

                // tunary operatot
                // if (start ==0 ) {prefic[end]}  else {prefix[end] -prefix[start-1];}
                Currsum = start==0 ? prefix[end] : prefix[end] -prefix[start-1];

                if(maxsum < Currsum){
                    maxsum =Currsum;
                }
            }
        }
        System.out.println(maxsum);
    }

    // find max using kadanes methode
    public static void kadanes(int[] arr){
        int MAxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i =0 ;i< arr.length;i++){
            currsum = currsum+arr[i];
            if(currsum < 0){
                currsum =0;
            }
            MAxsum = Math.max(currsum,MAxsum);
        }
        if (MAxsum==0){
            MAxsum = arr[0];
            for(int i =1;i<arr.length;i++){
                if(arr[i]>MAxsum){
                    MAxsum = arr[i];
                }
            }
        }
        System.out.println(MAxsum);
    }

    public static void main(String[] args) {
        int[] arr = {-12,-4,-6,-7,-3};
        kadanes(arr);
    }

}
