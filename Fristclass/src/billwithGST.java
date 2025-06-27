import java.util.Scanner;

public class billwithGST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float pen = scan.nextFloat();
        float pencil = scan.nextFloat();
        float eraser = scan.nextFloat();
        float total = pen+pencil+eraser;
        // first way to add gst
//        float GST = (total)*18/100;
//        float TotalAmout = total+GST;

        // secand way to add gst
        float newTotal = total + (0.18f * total);
        System.out.println(newTotal);
    }
}
