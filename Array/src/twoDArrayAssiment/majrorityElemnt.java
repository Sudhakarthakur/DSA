package twoDArrayAssiment;

public class majrorityElemnt {
    public static int find(int[][] Matrix , int target){
        int count = 0;
        int n = Matrix.length;
        int m = Matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(Matrix[i][j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] Matrix = {{4,7,8},{8,8,7}};
        System.out.println(find(Matrix,7));
    }
}
