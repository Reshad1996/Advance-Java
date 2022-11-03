package Class24;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {

        // ArrayList<int> numbers = new ArrayList<int>(); We can't to that with primitive data types
        // int => Integer
        // boolean => Boolean
        // byte => Byte
        // double => Double
        // long => Long
        // float => Float

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        System.out.println(numbers);

        for (Integer num:numbers) {
            System.out.println(num);
        }

        }
}

