package Class20;

public class HMW03_Soccer {

    // Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    //____________________________________________________________________________________________

    static void Soccer(String name , String team) {
        System.out.println(name+" is playing for "+team+" .");
    }
    static void Soccer(String name , String team, int number) {
        System.out.println(name+" is playing for "+team+" and he got the T-shirt no "+number+" .");
    }
    static void Soccer(String name , String team, String position) {
        System.out.println(name+" is playing for "+team+" and position he plays is  "+position+" .");
    }

    public static void main(String[] args) {
        HMW03_Soccer.Soccer("Cristiano Ronaldo","Manchester United");
        HMW03_Soccer.Soccer("Cristiano Ronaldo","Manchester United",7);
        HMW03_Soccer.Soccer("Cristiano Ronaldo","Manchester United","Forward");
    }
}
