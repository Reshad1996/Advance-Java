package Class14;

public class MethodsDemo01 {

    // A method that does not take any parameters and prints some lines on the console
    void printHello() {
        System.out.println("Hello World");
        System.out.println("Hello java");
    }

    // A method that takes a single parameter of the type String and print it
    void printWord(String word) {

        System.out.println(word);
    }

    public static void main(String[] args) {

        MethodsDemo01 obj = new MethodsDemo01();

        obj.printHello();
        obj.printWord("Reshad is a QA");
    }
}
