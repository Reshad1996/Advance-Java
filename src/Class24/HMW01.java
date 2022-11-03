package Class24;

import java.util.ArrayList;

public class HMW01 {
    public static void main(String[] args) {

        /*
          Create an ArrayList that will store 5 names into it.
          Find out whether the given ArrayList is empty or not?
          Check whether the specific name is present in an ArrayList or not?
          Find the size of your arrayList and print all values from that
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("Reshad");
        names.add("Srosh");
        names.add("Rashid");
        names.add("Shahir");
        names.add("Haris");

        if (names.isEmpty()) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("No array is not empty.");
        }

        if (names.contains("Haris")) {
            System.out.println("The name Haris is present in the array.");
        } else {
            System.out.println("The name Haris is not present in the array.");
        }

        System.out.println(names.size());
        System.out.println(names);

    }
}
