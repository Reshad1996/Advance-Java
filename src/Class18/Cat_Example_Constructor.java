package Class18;

public class Cat_Example_Constructor extends Animal_Inheritance {



    public Cat_Example_Constructor(String catName, String catBreed) {
        name = catName;
        breed = catBreed;
    }

   public Cat_Example_Constructor(String catName, String catBreed, int catAge, double catWeight) {
       name = catName;
       breed = catBreed;
       age = catAge;
       weight = catWeight;
    }

    public void printInfo() {
        System.out.println("Name "+name+" Breed "+breed+" age "+age+" weight "+weight);
    }
}
