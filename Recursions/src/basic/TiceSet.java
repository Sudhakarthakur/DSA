package basic;

public class TiceSet {
    public static int Tillingproblem(int n){
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // vertical choice
        int vertical = Tillingproblem(n-1);
        // horizental choicd
        int horizental = Tillingproblem(n-2);

        int total = vertical+horizental;
        return total;
    }

    public static void main(String[] args) {
        int n= 4;
        System.out.println(Tillingproblem(n));
    }
}
