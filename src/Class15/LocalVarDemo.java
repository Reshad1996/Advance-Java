package Class15;

public class LocalVarDemo {

    String name = "confused";  // instance variable which declare outside the block but inside the class
    public static void main(String[] args) {

        int nuumber = 0;
        /*
         * Local Variables are defined inside block of code and can only be used inside those block.
         *
         * System.out.println(name);
         */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        {
            int i = 0;
        }
           //  System.out.println(i); we cant do that local variables only work inside the block
    }

    void printNumber() {
        int number = 4 ;
        System.out.println(name);
        // System.out.println(number);
        String name = "Allan";
    }
}
