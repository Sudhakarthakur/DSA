package OOPS;

public class CreateClass {
    public static void main(String[] args) {
        pen p1 = new pen();  // cretate a pen object called p1
        p1.setColor("yello");
        System.out.println(p1.color);
    }
}
// create a class
class pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newtip){
        tip=newtip;
    }
}
