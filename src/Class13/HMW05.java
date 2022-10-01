package Class13;

import java.util.Scanner;

public class HMW05 {
    public static void main(String[] args) {

        // How would you check if String is palindrome or not? aba=> true
        // Abbc =>false
        // ___________________________________________________________________

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str1 = scan.nextLine();

        String str2 = "";
        for (int i=str1.length()-1 ; i>=0 ; i--) {
            str2 = str2 + str1.charAt(i);
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }

        System.out.println("----------------------------------------------------------------------");

        // Other way

        String str3 = "dad";
        StringBuilder stringBuilder = new StringBuilder(str3);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str3)) {
            System.out.println("The String is palindrome");
        }else {
            System.out.println("The String is not palindrome");
        }
    }
}
