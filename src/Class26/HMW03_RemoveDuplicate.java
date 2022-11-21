package Class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HMW03_RemoveDuplicate {
    public static void main(String[] args) {

        /* How can you remove all duplicates from ArrayList?

            List<String> aList=new ArrayList<>();
            aList.add("John");
            aList.add("Jane");
            aList.add("James");
            aList.add("Jasmine");
            aList.add("Jane");
            aList.add("James");
        */

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        System.out.println(aList);

        HashSet<String> hashSet = new HashSet<>(aList);
        System.out.println(hashSet);

    }
}
