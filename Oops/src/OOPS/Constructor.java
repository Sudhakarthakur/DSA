package OOPS;

public class Constructor {
    public static void main(String[] args) {
      student s1 = new student();      // Non_parameterized
        s1.Name = "sudhakar";
        s1.roll = 23;
        s1.passord ="we are uniqe";
        s1.Marks[0] = 100;
        s1.Marks[1] = 50;
        s1.Marks[2] = 10;

        student s2 = new student(s1);
        s2.passord = "hello";
        s1.Marks[2] = 80;
        for(int i=0; i<3; i++){
            System.out.println(s2.Marks[i]);
        }
    }
}
class student{
    String Name;
    int roll;
    String passord;
    int[] Marks;

//    //shallow copy constructor
//    student(student s1) {
//        Marks = new int[3];
//        this.Name = s1.Name;
//        this.passord = s1.passord;
//    }

    // Deep Copy contructor
    student(student s1){
        Marks = new int[3];
        this.Name = s1.Name;
        this.roll = s1.roll;
        for(int i=0; i<Marks.length; i++){
            this.Marks[i] = s1.Marks[i];
        }
    }

//      Non parameterzed
    student(){
        System.out.println("constructer is called");
    }
//     // parameterized
//    student(String name){
//        this.Name = name;
//    }
//     // copy constructor
//    Student( int roll){
//        this.roll = roll;
//    }
}
