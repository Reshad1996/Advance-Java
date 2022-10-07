package Class16;

public class Person {

    // private is only accessable inside the class
   private String password = "pass123";



    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println(obj.password);
    }


}
