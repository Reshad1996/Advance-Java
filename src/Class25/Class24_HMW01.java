package Class25;

import java.util.ArrayList;

public class Class24_HMW01 {
    public static void main(String[] args) {

        /*
          Create an ArrayList that will store 5 names into it.
          Find out whether the given ArrayList is empty or not?
          Check whether the specific name is present in an ArrayList or not?
          Find the size of your arrayList and print all values from that
         */

        ArrayList<String> names = new ArrayList<>(5);
        names.add("Reshad");
        names.add("Srosh");
        names.add("Rashid");
        names.add("Shahir");
        names.add("Haris");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Haris"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
