package Basic;

import java.util.Scanner;

public class product {
    public static  int product(int a , int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = scan.nextInt();
        System.out.println("Enter secand no");
        int b = scan.nextInt();

        System.out.println("product of a amd b is = "+product(a,b));
    }
}
