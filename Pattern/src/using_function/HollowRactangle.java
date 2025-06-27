package using_function;

public class HollowRactangle {
    public static void Hollow(int rows , int colums){
        for(int i =1; i<=rows ;i++){
            for(int j =1 ;j<=colums;j++){
                if(i==1 ||i == rows || j==1 ||j==colums ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow(4,5);
    }
}
