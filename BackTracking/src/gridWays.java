public class gridWays {
    public static int findWay(int i , int j , int m , int n){
        if(i == n-1 && j == n-1){
            return 1;
        }
        else if( i== n || j==n){
            return 0;
        }
        int right = findWay(i,j+1,m,n);
        int down = findWay(i+1,j,m,n);
        return right+down;
    }

    public static void main(String[] args) {
        int n =3 , m=3;
        System.out.println(findWay(0,0,n,m));

    }
}
