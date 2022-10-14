package Class18;

public class HMW01_Student {

    // Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
    //________________________________________________________________________________

    String name;
    String address;

    public HMW01_Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("My name is "+name+" and i'm staying in "+address);
    }

    public static void main(String[] args) {
         new HMW01_Student("Reshad","Atlanta(GA)").printInfo();
    }
}
