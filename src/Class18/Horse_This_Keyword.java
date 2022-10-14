package Class18;

public class Horse_This_Keyword extends Animal_Inheritance{



    public Horse_This_Keyword(String name, String breed, int age, double weight ) {
        this.name = name ;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }



    public static void main(String[] args) {

        Horse_This_Keyword obj = new Horse_This_Keyword("Spirit","Stallion",20,400);
        obj.printInfo();
    }
}
