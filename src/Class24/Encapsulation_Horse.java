package Class24;

public class Encapsulation_Horse {

    /*
      create a horse filed.
      have 5 fields of your code.
      create constructor and getter and setter methods for this class,
      atleast write one condition inside setter class
    */

    private String name;
    private String breed;
    private int age;
    private double weight;
    private double height;

    public Encapsulation_Horse(String name, String breed, int age, double weight, double height) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }

    public void setName(String name) {
        if (name.length() > 25) {
            System.out.println("You can not write a name more than 25 letters");
        }else {
            this.name = name;
        }
    }

    public void setBreed(String breed) {
        if (!breed.equals("German") ) {
            System.out.println("only german horses are allowed to the racing competation ");
        }else {
            this.breed = breed;
        }
    }

    public void setAge(int age) {
        if (age > 25) {
            System.out.println("Old horses are not allowd to race ");
        }else {
            this.age = age;
        }
    }

    public void setWeight(double weight) {
        if (weight<400) {
            System.out.println("Sport horses less than 400 weight is not allow to the race ");
        }else {
            this.weight = weight;
        }
    }

    public void setHeight(double height) {
        if (height < 2) {
            System.out.println("Horses with 2ft height are not allow to the racing competetion");
        } else {
            this.height = height;
        }
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    void printInfo() {
         System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight+" Height"+height);
    }
}

class Horse_Tester {
    public static void main(String[] args) {

        Encapsulation_Horse obj = new Encapsulation_Horse("Clover","German",15,500,2.2);
        obj.printInfo();
    }
}

