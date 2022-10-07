package Class15;

public class Dog {

    String name;   // --> instance variable
    static int  noOFlegs = 4;  // --> static variable
    String color;

    void bark () {
        int i = 10; // --> local variable
        for (int j =0 ; j<i ; j++) {
            // int j i also local variable
            System.out.println("Barking");
        }
    }

    void printInfo() {
        System.out.println("name "+name+" color "+color);
    }

    void printName() {
        System.out.println("name "+name);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Tommy";
        dog1.bark();

        Dog dog2 = new Dog();
        dog2.name = "poppy";
        System.out.println(dog2.name);
    }
}
