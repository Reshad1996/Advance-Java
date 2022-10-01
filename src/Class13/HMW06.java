package Class13;

public class HMW06 {
    public static void main(String[] args) {

        // How would you swap  2 strings without a temporary variable?
        //_______________________________________________________________________________

        int a = 12;
        int b = 24;

        a = a+b; // a is 36
        b = a-b;
        a = a-b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("-----------------------------------------");

        String str1 = "payton";
        String str2 = "Java";

        str1 = str1+str2;
        str2 = str1.replace(str2,"");
        str1 = str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);
    }
}
