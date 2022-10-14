package Class18;

public class This_Keyword_Demo {

    String str = "Red";

    void print() {
        String str = "Blue";
        System.out.println(str);
        System.out.println(this.str);
    }

    public static void main(String[] args) {
        new This_Keyword_Demo().print();
    }
}
