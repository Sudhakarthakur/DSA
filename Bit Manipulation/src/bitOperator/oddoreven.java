package bitOperator;

public class oddoreven {
    public static void oddeven(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            // even number
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddeven(23);
        oddeven(12);
        oddeven(78);
    }
}
