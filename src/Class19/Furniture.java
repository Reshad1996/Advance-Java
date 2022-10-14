package Class19;

public class Furniture {
    String color = "Green";
}

class Chair extends Furniture{
    String color = "Red";

    void printColor() {
        String color = "Black";
        System.out.println(color);      // prints the local variable
        System.out.println(this.color); // prints the instance variable from same class
        System.out.println(super.color); // print the instance variable from a differnent class
    }
}

class TestChair {
    public static void main(String[] args) {
        Chair  chair = new Chair();
        chair.printColor();
    }
}