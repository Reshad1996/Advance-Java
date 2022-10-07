package Class14;

public class HMW03Palindrome {

    // Create a method that will print whether given String is palindrome or not.

    String palindrome (String word) {
        word = word.toLowerCase();
        StringBuilder str = new StringBuilder(word);
        str.reverse();

        if (str.reverse().toString().equals(word)) {
            return "It is a palindrome";
        }else {
            return "It is not palindrome";
        }
    }

    public static void main(String[] args) {

        HMW03Palindrome reverse = new HMW03Palindrome();
        reverse.palindrome("Dad");
        System.out.println(reverse.palindrome("mom"));
    }
}
