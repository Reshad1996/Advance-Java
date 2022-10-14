package Class20;

public class HMW01_Area {

    // Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    //
    //Use separate class to test your code
    //______________________________________________________________________________________________________

    static void CalculateArea(int length ,int width ) {
        System.out.println("Area of rectangle is "+(length*width));
    }
    static void CalculateArea(int side ) {
        System.out.println("Area of square is "+(side*side));
    }
    static void CalculateArea(int length ,int width , int heigth  ) {
        System.out.println("Area of box is "+(length*width*heigth));
    }
}
