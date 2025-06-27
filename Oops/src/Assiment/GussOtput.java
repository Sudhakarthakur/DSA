package Assiment;

public class GussOtput {
    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
    }
}

class Automoblie{
    private String drive() {
        return "drive vehical";
    }
}
class Car extends Automoblie{
    protected String drive(){
        return "drive car";
    }
}
class ElectricCar extends Car {
    @Override
    public final String drive(){
        return "drive electic car";
    }
}
