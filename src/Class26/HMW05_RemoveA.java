package Class26;

import java.util.Iterator;
import java.util.LinkedList;

public class HMW05_RemoveA {
    public static void main(String[] args) {

        /* Create a Set of cities in which you want to make sure that insertion order is maintained.
           Then remove any city that starts with “A”;
        */

        LinkedList<String> cities = new LinkedList<>();
        cities.add("Kabul");
        cities.add("New York");
        cities.add("Atlanta");
        cities.add("Istanbul");
        cities.add("Delhi");
        cities.add("Amsterdam");
        cities.add("Berlin");
        System.out.println(cities);

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
          String item = iterator.next();
          if (item.startsWith("A")) {
              iterator.remove();
          }

        }
        System.out.println(cities);




    }
}
