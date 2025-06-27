package Ac;

import java.util.Stack;

public class MaxArea {
    public static void maxArea(int arr[]){
        int Maxarea = 0;
        // nsl = next smaller left
        int[] nsl = new int[arr.length];
        // nsr = next smaller right
        int[] nsr = new int[arr.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i= arr.length-1;i>=0;i--){
           while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
               s.pop();
           }
           if(s.isEmpty()){
               nsr[i] = arr.length;
           }else{
               nsr[i] = s.peek();
           }
           s.push(i);
        }

        // next smaller left
          s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // find max area
        for(int i=0; i< arr.length; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            Maxarea = Math.max(Maxarea,currArea);
        }
        System.out.println(Maxarea);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
