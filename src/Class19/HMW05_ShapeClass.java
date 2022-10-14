package Class19;

public class HMW05_ShapeClass {

    // Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code
    //_________________________________________________________________________________________________________

    double radius;

    public HMW05_ShapeClass(double radius) {
        this.radius = radius;
    }
}

class CircalClass extends HMW05_ShapeClass {

    public CircalClass(double radius) {
        super(radius);
    }

    public void CalculateTheAreaOfCircle() {
        double area;
        area = 3.14 * radius * radius;
        System.out.println("Area of the circle is "+area+" Square Unit");
        System.out.println();
    }

    public static void main(String[] args) {
        new CircalClass(4).CalculateTheAreaOfCircle();
    }
}