package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HMW02 {
    private static int drink;
    public static void main(String[] args) {


        // Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("Ice Tea");
        drinks.add("Cocktails");
        drinks.add("Milk");
        drinks.add("Green Tea");

        System.out.println(drinks);
        Iterator<String> iterator = drinks.iterator();

        while (iterator.hasNext()) {

            String item = iterator.next();

            if (item.contains("e") || (item.contains("a"))) {
                drinks.set(drink, "Water");
            }
            drink++;
        }
        System.out.println(drinks);

    }
}
