package Project01;

public interface Assignment01_Shape {

    /* 1. Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
          Create 2 classes Circle & Square that implements functionality defined in
          the Shape Interface. Test your code.
    */

    public void calculateArea(double r);
    public void calculatePerimeter(double r);
}

class Circle implements Assignment01_Shape {

    public void calculateArea(double r) {
        System.out.println("The area of a circle is "+(3.14*r*r));
    }
    public void calculatePerimeter(double r) {
        System.out.println("The perimeter of a circle is "+(2*3.14*r));
    }
}

class Square implements Assignment01_Shape {

    public void calculateArea(double s) {
        System.out.println("The area of a square is "+(3.14*s*s));
    }
    public void calculatePerimeter(double s) {
        System.out.println("The perimeter of a square is "+(4*s));
    }

    public static void main(String[] args) {

        Assignment01_Shape circle = new Circle();
        circle.calculateArea(5);
        circle.calculatePerimeter(5);
        System.out.println("________________________________________________");
        Assignment01_Shape square = new Square();
        square.calculateArea(4);
        square.calculatePerimeter(4);
    }
}