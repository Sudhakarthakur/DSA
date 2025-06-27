package Basic;

public class BinToDec {

    public static void BintoDec(int binNo){
        int pow = 0;
        int decNo =0;

        while (binNo >0){
            int lastDigit = binNo % 10 ;
            decNo = decNo + (lastDigit *(int)Math.pow(2,pow));

            pow++;
              binNo = binNo/10;
        }
        System.out.println("decimal is "+decNo);
    }

    public static void DecToBinn(int n){

    }


    public static void main(String[] args) {
        BintoDec(1011);
    }
}
