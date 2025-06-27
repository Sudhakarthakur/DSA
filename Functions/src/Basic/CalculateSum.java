package Basic;

import java.util.Scanner;

public class CalculateSum {
     public static void Calsum(int a, int b){ // parametters and formal parameters
         int sum = a+b;
         System.out.println(sum+" ");
     }

    public static void main(String[] args) {
       Scanner  scan = new Scanner(System.in);
       int a = scan.nextInt();
       int b = scan.nextInt();
        Calsum(a,b);   // Arguments or Actual parameters

    }
}
