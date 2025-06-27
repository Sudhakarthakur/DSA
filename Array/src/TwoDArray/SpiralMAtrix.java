package TwoDArray;

public class SpiralMAtrix {
    public static void Spiral(int[][] matrix){
        int startRow = 0;
        int startCol =0;
        int Endrow =  matrix.length;
        int Endcol = matrix[0].length;

        while (startRow < Endrow && startCol < Endcol) {
            //top
            for(int j=startCol; j<=Endcol ;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1; i<=Endrow; i++){
                System.out.print(matrix[i][Endcol]+" ");
            }

            //bottom
            for(int j=Endcol-1; j>=startCol; j--){
                if(startRow == Endrow){
                    break;
                }
                System.out.print(matrix[Endrow][j]+" ");
            }

            //left
            for(int i=Endcol-1; i>startCol+1; i--){
                if(startCol == Endcol){
                    break;
                }
                System.out.print (matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            Endcol--;
            Endrow--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[][] Matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,15}
        };
        Spiral(Matrix);
    }
}
