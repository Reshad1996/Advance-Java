package Class16;

public class HMW02_StringReverse {

    // creating an instance of the class.
    // Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    //_______________________________________________________________________________________________

    public static String stringReverse(String reverse) {
        // one way
       /* StringBuilder a = new StringBuilder(reverse);
        String b = a.reverse().toString();
        return b; */
        // second way
        return new StringBuilder(reverse).reverse().toString();
    }

    public static void main(String[] args) {
        HMW02_StringReverse obj = new HMW02_StringReverse();
        System.out.println("Ahmad Reshad Gulzada");
        System.out.println(obj.stringReverse("Ahmad Reshad Gulzada"));
    }
}
