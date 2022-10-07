package Class16;

public class HMW03_Vowel {

    // Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.
    //________________________________________________________________________________________________________________

    private static String Vowel(String a) {
        // first way
       /* String Vowel = a.toLowerCase().replaceAll("[^aieou]","");
        return Vowel; */
        // second way
        return a.replaceAll("[^aieouAIEOU]","");
    }

    public static void main(String[] args) {

        System.out.println(Vowel("book"));
    }
}
