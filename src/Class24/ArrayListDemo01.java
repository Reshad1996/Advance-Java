package Class24;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {

        // Syntax to create an arraylist
        ArrayList<String> colors =  new ArrayList<>();
        // Use method to insert elements in an arraylist
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // print all the elements
        System.out.println(colors);
        // get method prints individual elements from arraylist
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        // size of the arraylist element
        System.out.println(colors.size());

        // get all the elements through normal loop
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // get all the elements through enhanced loop
        System.out.println("*****************************************");

        for (String color:colors) {
            System.out.println(color);

        }
    }
}
