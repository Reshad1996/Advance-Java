package Class14;

public class HMW04 {

    // Create a method that will say Hello in different language based on the country that will passed when method is executed

    String country (String word) {
        if (word.equals("afghanistan")) {
            return "Salam Alikom";
        } else if (word.equals("spanish")) {
            return "Hola";
        } else if (word.equals("India")) {
            return "Namaste";
        } else if (word.equals("france")) {
            return "Bonjour";
        }else {
            return "Country doesn't exist";
        }
    }

    public static void main(String[] args) {
        HMW04 language = new HMW04();
        System.out.println(language.country("afghanistan"));
    }
}
