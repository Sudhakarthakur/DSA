package Basic;

public class BinomialCofficient {
    public static int FActorialofN(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinCoff(int n, int r) {
        int N_Factorial = FActorialofN(n);
        int R_Factorial = FActorialofN(r);
        int NR_Facotail = FActorialofN(n - r);
        int Bincoff = N_Factorial / (R_Factorial * NR_Facotail);
        return Bincoff;
    }

    public static void main(String[] args) {
        System.out.println(BinCoff(5, 2));
    }
}
