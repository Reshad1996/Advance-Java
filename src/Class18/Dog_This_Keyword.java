package Class18;

public class Dog_This_Keyword extends Animal_Inheritance{


    String color;
    double height;

    public Dog_This_Keyword(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }

    public Dog_This_Keyword(String name, String breed, String color, int age, double weight, double height) {
       /* this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight; */
        this(name, breed, color, age, weight);
        this.height = height;
    }
}
