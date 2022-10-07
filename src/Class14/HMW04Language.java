package Class14;

public class HMW04Language {

    // Create a method that will say Hello in different language based on the country that will passed when method is executed

    String country (String word) {
        if ("afghanistan".equals(word)) {
            return "Salam Alikom";
        } else if ("spanish".equals(word)) {
            return "Hola";
        } else if ("India".equals(word)) {
            return "Namaste";
        } else if ("france".equals(word)) {
            return "Bonjour";
        }
        return "Country doesn't exist";
    }

    public static void main(String[] args) {
        HMW04Language language = new HMW04Language();
        System.out.println(language.country("afghanistan"));
    }
}
