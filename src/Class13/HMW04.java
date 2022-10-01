package Class13;

import java.util.Arrays;

public class HMW04 {
    public static void main(String[] args) {

        // How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        String sentence = "This is sentence i want to reverse";
        String[] arr = sentence.split(" ");
        String reversed = "";

        for (int i = 0; i < arr.length; i++) {

            String arr1 = arr[i];
            String reversedWord = "";
            for (int j = arr1.length() - 1; j >= 0; j--) {

                reversedWord = reversedWord + arr1.charAt(j);
            }
            reversed = reversed + reversedWord + " ";
        }
        System.out.println(sentence);
        System.out.println(reversed);

        System.out.println("--------------------------------------------------------------");

        // Other way
        String str = "This is sentence i want to reverse";
        String[] str1 = str.split(" ");
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < str1.length ; i++) {
            String word =  str1[i];
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            str1[i] = stringBuilder.toString();
            st.append(arr[i]).append(" ");
        }
        System.out.println(st);


    }
}



