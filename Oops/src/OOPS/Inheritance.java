package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }
}

// Base class ya Parents Class
class Animal {
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void Breathe(){
        System.out.println("Breathes");
    }
}

// Derived class Ya child class
class fish extends Animal{
    int fins;
    void swim() {
        System.out.println("Swin in water");
    }
}
