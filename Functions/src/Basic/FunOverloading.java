package Basic;

public class FunOverloading {
    // in function overloading the parameter have diffeent
    // if return type have differnt data type then it's not

    // function overloadin depend on parametters
    // not depend on return type of user define data type


    // fun overloading
//    like example
    // public static int sum(int a , int b){};
    // public static void sum(int a , int b){};
    // public static fload sum(int a , int b){};

//    it's not overloading'


    // example of overloading
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void sum(float a , float b){
        float s = a+b;
        System.out.println(s);
    }
    public static void main(String[] args) {

        System.out.println(sum(3,6,2));
    }
}
