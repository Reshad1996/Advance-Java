package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HMW01 {
    public static void main(String[] args) {

        // Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> words = new ArrayList<>();
        words.add("Syntax");
        words.add("Java");
        words.add("Language");
        words.add("Selenium");
        words.add("Software");

        Iterator<String> iterator =  words.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
