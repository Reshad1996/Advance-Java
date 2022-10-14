package Class17;

public class HMW01_Phone_Constructor {

    // Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
    //______________________________________________________________________________________________________-

    String name;
    String model;
    int year;

    HMW01_Phone_Constructor(String phoneName, String phoneModel, int phoneYear) {
          name = phoneName;
          model = phoneModel;
          year = phoneYear;
    }

    HMW01_Phone_Constructor() {

    }

    void printPhone() {
        System.out.println("My new phone is "+name+" and the model is "+model+" the latest version "+year);
    }

}
