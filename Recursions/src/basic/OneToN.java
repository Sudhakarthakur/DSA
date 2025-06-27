package basic;

public class OneToN {
          // increasing order
    public static void print(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }

    // decrease order
    public static void printdec(int n){
        if(n==1){
            System.out.print(n+" ");
        }
        System.out.println(n+" ");
        printdec(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
}
