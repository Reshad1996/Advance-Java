package Class22;

public class Animal_Tester {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sleep();
        cat.eat();

        Overriding_TypeCasting_Animal animal=new Panda(); // Upcasting
        //  Panda panda=new Animal();  // down-casting
        Overriding_TypeCasting_Animal animal1=new Cat();
        Overriding_TypeCasting_Animal [] animals={new Cat(),new Panda()};
    }
}
