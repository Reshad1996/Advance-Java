package Class22;

public class Car_Tester {

    public static void main(String[] args) {

        BMW obj = new BMW();
        obj.start();
        obj.stop();

        System.out.println("**************");

        Toyota obj1 = new Toyota();
        obj1.start();
        obj1.stop();

        System.out.println("**************");

        Tesla obj2 = new Tesla();
        obj2.start();
        obj2.stop();
        obj2.park();
    }
}
