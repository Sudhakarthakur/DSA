package Basic;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        int[] marks = new int[10];

        Scanner scan = new Scanner(System.in);

        marks[0] = scan.nextInt();
        marks[1] = scan.nextInt();
        marks[2] = scan.nextInt();
        marks[3] = scan.nextInt();

        System.out.println("physic "+marks[0]);
        System.out.println("Chemistr "+marks[1]);
        System.out.println("Mathematics "+marks[2]);
        System.out.println("Biology "+marks[3]);

        // find percentage
        int percentage = (marks[0]+marks[1]+marks[2]+marks[3])/4;
        System.out.println("percentage of marks "+percentage);
    }
}
