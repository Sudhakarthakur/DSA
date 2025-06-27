package Ac;

import java.util.Stack;

public class Nextgrater {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int[] nextgreater = new int[arr.length];

        for(int i= arr.length-1; i>=0 ;i--){
            // step 1
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // step 2
            if(s.isEmpty()){
                nextgreater[i] = -1;
            }else {
                nextgreater[i] = arr[s.peek()];
            }
            // step 3
            s.push(i);
        }
        for(int i=0; i< nextgreater.length; i++){
            System.out.print(nextgreater[i]+" ");
        }
    }
}
