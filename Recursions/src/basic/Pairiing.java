package basic;

public class Pairiing {
    public static int friendPair(int n){
        if(n == 1 || n == 2)  return n;

        // for single
        int fnm1 = friendPair(n-1);

        // for pair
        int fnm2 = friendPair(n-2);
        int pairways = (n-1)*fnm2;

        // totalways
        int totways = fnm1 + pairways ;
        return totways;
    }
    public static void main(String[] args){
        System.out.println(friendPair(3));
    }
}
