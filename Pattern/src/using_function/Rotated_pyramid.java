package using_function;

public class Rotated_pyramid {
    public static void PrintRoated(int rows, int colums){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colums-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        PrintRoated(4,4);
    }
}
