package basic;

public class XToPoewerN {
    public static int finndpow(int x , int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = finndpow(x,n-1);
        int xn = x * xnm1;
        return xn;

//        return x * finndpow(x,n-1);
    }

    // optimize function
    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        int halfpow = power(x,n/2);
        int halfpowSq = halfpow * halfpow;

        // if n is odd
        if(n%2 != 0){
            halfpowSq = n * halfpowSq;
        }
        return halfpowSq;
    }

    public static void main(String[] args) {
        System.out.println(finndpow(2,8));
    }
}
