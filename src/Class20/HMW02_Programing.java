package Class20;

public class HMW02_Programing {

    // Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    // then the message "I love programming languages" should be printed.
    // If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    // Example, if we pass "Java", then "I love Java" should be printed.
    //________________________________________________________________________________________________________________

    void ProgramingLanguage() {
        System.out.println("I love programming languages");
    }

    void ProgramingLanguage(String language) {
        System.out.println("I love "+language);
    }

    public static void main(String[] args) {
        HMW02_Programing obj = new HMW02_Programing();
        obj.ProgramingLanguage();
        obj.ProgramingLanguage("JAVA");
    }
}
