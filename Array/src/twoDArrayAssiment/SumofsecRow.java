package twoDArrayAssiment;

import java.util.Scanner;

public class SumofsecRow {
    public static int Sum(int[][] Matrix){
//        int n = Matrix.length;
//        int m = Matrix[0].length;
//        int secamdroe =1;
//        int sum = 0;
//        for(int i=secamdroe; i<=secamdroe; i++){
//            for(int j=0; j<m; j++){
//
//                    sum=sum+Matrix[i][j];
//
//            }
//        }
//        return sum;


        int sum=0;
        for(int j=0; j<Matrix[0].length; j++){
            sum = sum + Matrix[1][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] Matix = {
                {1,4,9},
                {11,9,3},
                {2,2,3}
        };
        System.out.println(Sum(Matix));
    }
}
