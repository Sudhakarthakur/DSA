package using_function;

public class fLOYDTranle {
    public static void FloydTrgle(int n){
        int nu =1;
        for(int i =1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(nu+" ");
                nu++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydTrgle(5);
    }
}
