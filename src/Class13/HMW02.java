package Class13;

public class HMW02 {
    public static void main(String[] args) {

        // Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
        //___________________________________________________________________________________________

        String str = "abcde123456FGHIJKL!@#$%^&*";

        String arr = str.replaceAll("[^a-z0-9A-Z]","");

        int alphaNumeric = 0;
        for (int i=0 ; i<arr.length() ; i++) {
            alphaNumeric = alphaNumeric+1;
        }
        System.out.println("Total of alphanumeric in string is = "+alphaNumeric);


    }
}
