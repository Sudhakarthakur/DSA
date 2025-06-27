public class NQueens {
    // find Queen is safe or not
    public static boolean isSafe(char board[][] , int row , int col){
        // chaek for vertical position
        for(int i=row; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diagonal left up
        for(int i=row-1 ,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for(int i=row-1 ,j=col+1 ; i>=0 && j<board.length; i--,j++){
            if(board[i][j] =='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQuess(char board[][] , int row){
        // base
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }
         // colum loop
        for(int j=0; j< board.length; j++){
            if(isSafe(board , row , j)){
                board[row][j] ='Q';   // function call
                nQuess(board,row+1);   // BAcktracking
                board[row][j] ='x';
            }
        }
    }

    // find possible solution is avilable or not
    // and print 1 solution
    public static boolean nfQuess(char board[][] , int row){
        // base
        if(row == board.length){
//            printBoard(board);
//            count++;
            return true;
        }
        // colum loop
        for(int j=0; j< board.length; j++){
            if(isSafe(board , row , j)){
                board[row][j] ='Q';   // function call
                if(nfQuess(board,row+1)){   // BAcktracking
                    return true;
                }
                board[row][j] ='x';
            }
        }
        return false;
    }



    // find which solution of this probem
    public static int count = 0;
      // print chess board
    public static void printBoard(char board[][]){
        System.out.println("______ Chess Borad ________");
        for (int i=0 ;i< board.length; i++){
            for (int  j=0; j< board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][]  = new char[n][n];
         // intialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        nQuess(board,0);

        if(nfQuess(board,0)) {
            System.out.println("Solution is aviable");
            printBoard(board);
        }else {
            System.out.println("solution is not avilable");
        }
    }
}
