package Class14;

public class HMW03 {

    // Create a method that will print whether given String is palindrome or not.

    String palindrome (String word) {

        StringBuilder str = new StringBuilder(word);
        str.reverse();

        if (str.reverse().toString().equals(word)) {
            return "It is a palindrome";
        }else {
            return "It is not palindrome";
        }
    }

    public static void main(String[] args) {

        HMW03 reverse = new HMW03();
        reverse.palindrome("dad");
        System.out.println(reverse.palindrome("mom"));
    }
}
