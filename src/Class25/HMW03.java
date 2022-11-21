package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HMW03 {
    public static void main(String[] args) {

        // Create an arrayList of even numbers from 1 to 500.
        // Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 2; i <=100 ; i+=2) {
             even.add(i);
        }
        System.out.println(even);

        Iterator<Integer> iterator = even.iterator();
        while (iterator.hasNext()) {
            Integer eve = iterator.next();
            if (eve%5==0) {
                iterator.remove();
            }
        }
        System.out.println(even);
    }
}
