package Class14;

public class MethodsDemo02 {

    void printManyTimes(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello World");
        }
    }

    // In parameters sequence and data type matters
    void printCustomerWordManyTimes(String word,int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
    public static void main(String[] args) {

        MethodsDemo02 md = new MethodsDemo02();
        md.printManyTimes(2);
        md.printCustomerWordManyTimes("Syntax Easy", 2);
    }
}
