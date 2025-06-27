package using_function;

public class Trangleof0and1 {
    public static void Trangle0and1(int n){
        int first =0;
        int secand=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(secand+" ");
                }else{
                    System.out.print(first+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Trangle0and1(5);
    }
}
