package Class14;

public class HMW02 {

    // Create a method that will take a number and prints whether the number is even or odd.

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        MethodsDemo03 md = new MethodsDemo03();

        if (md.isEven(50)) {
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
}
