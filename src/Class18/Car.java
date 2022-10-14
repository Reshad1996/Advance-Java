package Class18;

public class Car {
    // common class has many names like parents class, super class, base class
    String model;
    String make;
    int year;
    String color;
    int topspeed;
    double price;

    // if the class field is private we can't inherited it into other class
    private String engintype;

    void printCarDetails() {
        System.out.println("Model "+model+" Make "+make+" Color "+color);
    }
}

class BMW extends Car {
    // Child class, Derived class
    double enginCC;

}

class Tesla extends Car {

}

class Toyota extends Car{
    double enginCC;
}

class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.make = "BMW";
        bmw.color = "Red";
        bmw.model = "x8";
        bmw.enginCC = 500;
        bmw.printCarDetails();
    }
}