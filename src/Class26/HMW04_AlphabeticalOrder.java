package Class26;

import java.util.TreeSet;

public class HMW04_AlphabeticalOrder {
    public static void main(String[] args) {

        /* Create a Set collection in which you need to add names of the countries.
           In this set we want all objects to be sorted in alphabetical order.
           Using 2 different ways retrieve all elements from set.
        */

        TreeSet<String> countries = new TreeSet<>();
        countries.add("Afghannistan");
        countries.add("United State");
        countries.add("Germanu");
        countries.add("France");
        countries.add("Russia");
        countries.add("India");
        countries.add("China");
        countries.add("Japan");

        System.out.println("First way of retrieving all th elements from set.");
        System.out.println(countries);

        System.out.println("Second way of retrieving all th elements from set.");

        for (String country:countries) {
            System.out.print(country+",");
        }



    }
}
