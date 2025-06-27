package TwoDArray;

import java.util.Scanner;

public class Implimentation {

    public static int biggest(int Matrix[][]){
        int max = -1;

        for(int i=0; i< Matrix.length; i++){
            for(int j=0; j<Matrix[0].length; j++ ){
               if(Matrix[i][j] > max){
                   max = Matrix[i][j];
               }
            }
        }
        return max;
    }
    public static  boolean search(int Matrix[][] , int key){

        for(int i=0; i< Matrix.length; i++){
            for(int j=0; j<Matrix[0].length; j++ ){
                if(Matrix[i][j] == key){
                    System.out.println("found at cell (" + i + "," + j +")");
                    return true;
                }
            }
        }
        return false;
    }

    public static int smallest(int Matrix[][]){
            int min = Integer.MAX_VALUE;

        for(int i=0; i< Matrix.length; i++){
            for(int j=0; j<Matrix[0].length; j++ ){
                if(Matrix[i][j]<min){
                    min = Matrix[i][j];

                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] Matrix = new int[3][4];
//        int n=3, m =3;
        int n = Matrix.length , m=Matrix[0].length;

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++ ){
                Matrix[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++ ){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(smallest(Matrix));

    }
}
