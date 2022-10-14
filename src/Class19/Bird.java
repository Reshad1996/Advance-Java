package Class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    public Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println("Name "+name+" Ccolor "+color+" Age "+age+" Weight "+weight);
    }
}

class Parrot extends Bird {

     Parrot (String name, String color , int age, double weight) {
         super(name, color, age, weight);
        /*this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;*/
    }
}

class Crow extends Bird {

    Crow (String name, String color , int age, double weight) {
        super(name, color, age, weight);
        /*this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;*/
    }
}

class Sparrow extends Bird {

    Sparrow (String name, String color , int age, double weight) {
        super(name, color, age, weight);

        /*this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;*/
    }
}

class Test {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("zeki","Green", 2,1);
        parrot.printInfo();

        Crow crow = new Crow("crow","black",3,1.5 );
        crow.printInfo();

        Sparrow sparrow = new Sparrow("sparrow","",3,1.5 );
        crow.printInfo();
    }
}