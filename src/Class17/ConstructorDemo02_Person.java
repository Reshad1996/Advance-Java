package Class17;

import java.util.Scanner;

public class ConstructorDemo02_Person {

    String name;
    String color;
    String country;
    int age;
    double weight;
    String hairColor;
    String eyeColor;
    double height;
    static char gender='M';


    public ConstructorDemo02_Person(){

    }

    public ConstructorDemo02_Person(String perName){
        name=perName;
    }
    public ConstructorDemo02_Person(String name, String color, String country, int age, double weight, String hairColor, String eyeColor, double height, char gender) {
        this.name = name;
        this.color = color;
        this.country = country;
        this.age = age;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.gender = gender;
    }

    public static void main(String[] args) {
        ConstructorDemo02_Person person=new ConstructorDemo02_Person();
        ConstructorDemo02_Person person2=new ConstructorDemo02_Person("Asma");
        Scanner scanner=new Scanner(System.in);
    }
}
