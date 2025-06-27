package basic;

public class Fibonachi {
           public static int fibbo(int n){
               if(n==0 || n==1) {
                   return n;
               }

               int fbnm1 = fibbo(n-1);
               int fbnm2 = fibbo(n-2);
               int fb = fbnm1+fbnm2;
               return fb;
           }
    public static void main(String[] args) {
        int n=26;
        System.out.println(fibbo(n)+" ");
    }
}
