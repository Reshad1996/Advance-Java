package Class24;

import java.util.ArrayList;

public class ArrayListDemo04 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Reshad");
        names.add("salma");
        names.add("srosh");
        names.add("shahir");
        // for specifying the replacing index place
        names.set(2,"josh");
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(40);
        numbers.add(60);
        // for specifying the shifting index place
        numbers.add(1,100);
        System.out.println(numbers);
     //   numbers.clear();   // delete all the elements from the list
    }
}
