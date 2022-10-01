package Class13;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;

public class HMW03 {
    public static void main(String[] args) {

        // You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?
        //____________________________________________________________________________________________

        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] arr = str.split("[?]");
        System.out.println(Arrays.toString(arr));

        int total = 0 ;

        for (int i=0 ; i< arr.length ; i++) {
            total = total+1;
        }
        System.out.println("Total of sentence in string = "+total);
    }
}
