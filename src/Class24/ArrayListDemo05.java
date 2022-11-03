package Class24;

import java.util.ArrayList;

public class ArrayListDemo05 {
    public static void main(String[] args) {

        ArrayList<String> colors =  new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);
        // colors.remove("Blue");
        colors.remove(2);
        System.out.println(colors);
    }
}
