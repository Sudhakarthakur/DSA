package Basic;

public class DecToBin {
    public static void decTbin(int n){
        int mynum =0;
        int pow =0;
        int binNum =0;
        while(n>0){
            int rem = n%2;
            binNum = binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println(binNum);
    }

    public static void main(String[] args) {
        decTbin(5);
    }
}
