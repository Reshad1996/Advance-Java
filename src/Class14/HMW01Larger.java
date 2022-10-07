package Class14;

public class HMW01Larger {

    // Create a method that will take 2 parameters as a numbers and prints which number is larger.


    void largest(int num1,int num2) {
        if (num1>num2) {
            System.out.println("largest number is  = " + num1);
        }else {
            System.out.println(" largest number is = " + num2);
        }
    }

    public static void main(String[] args) {

        HMW01Larger larger = new HMW01Larger();
        larger.largest(5,10);
    }
}
