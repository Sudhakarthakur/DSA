import java.util.Scanner;
public class Averageof3input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = scan.nextInt();
        System.out.println("Enter Secand no");
        int b = scan.nextInt();
        System.out.println("Enter third no");
        int c = scan.nextInt();
         int average = (a+b+c)/3;
        System.out.println("Average of inputs " + average);
    }
}