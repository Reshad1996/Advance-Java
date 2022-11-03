package Class24;

public class Encapsulation_Dog {

    private String name;
    private String breed;
    private int age;
    private double weight;

    public Encapsulation_Dog(String name, String breed, int aga, double weight) {
      /*  if (name.length() > 30) {
            System.out.println("Name can't be more than 30 letters. Please try again");
        }else if (name.isEmpty()) {
            System.out.println("Name can't be empty Please try again");
        }else {
            this.name = name;
        }
       */

       /* if (breed.length() > 20) {
            System.out.println(" Breed can't be more than 20 letters. Please try again");
        }else if (breed.isEmpty()) {
            System.out.println("Breed can't be empty Please try again");
        }else {
            this.breed = breed;
        }
        */

        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }

    void setName(String name) {
        if (name.length() > 30) {
            System.out.println("Name can't be more than 30 letters. Please try again");
        }else if (name.isEmpty()) {
            System.out.println("Name can't be empty Please try again");
        }else {
            this.name = name;
        }
    }

    void setBreed(String breed) {
        if (breed.length() > 20) {
            System.out.println(" Breed can't be more than 20 letters. Please try again");
        }else if (breed.isEmpty()) {
            System.out.println("Breed can't be empty Please try again");
        }else {
            this.breed = breed;
        }
    }

    void setAge(int age) {
        if (age > 20) {
            System.out.println("Please use less age something seems wrong here, are you sure it is a dog?");
        }else if (age < 0) {
            System.out.println("Age can't be negative");
        }else {
            this.age = age;
        }
    }

    void setWeight(double weight) {
        if (weight<0) {
            System.out.println("Negative weight is not allowed. Please try again");
        } else if (weight > 300 ) {
            System.out.println("Please try less than 300 it looks more of elephant ");
        }else {
            this.weight = weight;
    }
    }

    String getName() {
        return name;
    }
    String getBreed() {
        return  breed;
    }
    int getAge() {
        return age;
    }
    double getWeight() {
        return weight;
    }
    void printInfo() {
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight);
    }
}

class Test {
    public static void main(String[] args) {

        Encapsulation_Dog obj = new Encapsulation_Dog("Tommy","German",10,12.50);
        obj.printInfo();
       // System.out.println(obj.name); we can not access it with private modifiers rather than getter
        System.out.println(obj.getName());
    }
}