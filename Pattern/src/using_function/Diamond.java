package using_function;

public class Diamond {
    public static void Diamonapatt(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=(n-i);j++){
                System.out.println(" "+" ");
            }
          for(int l =0 ;l<=2i-1;l++){
                System.out.println("*"+" ");
            }
            System.out.println();
       }
        for(int i=n;i>=1;i--){
            for(int j =1;j<=(n-i);j++){
                System.out.println(" "+" ");
            }
            for(int l =0 ;l<=2i-1;l++){
                System.out.println("*"+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Diamonapatt(4);
    }
}
