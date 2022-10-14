package Class21;

public class HMW02 {

    // Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    // Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    // Call the method by creating an object of each of the three classes.
    //_________________________________________________________________________________________________________
    public static void main(String[] args) {
        CreditCard obj = new CreditCard();
        obj.calculateInterest(4000.0);
        Visa obj1 = new Visa();
        obj1.calculateInterest(5000.44);
        AX obj2 = new AX();
        obj2.calculateInterest(6000.55);
    }
}

class CreditCard {

    double balance;
    double interest;

    void calculateInterest (double balance) {
        System.out.println("The interest for buying BMW car is "+(5.0/100)*balance);
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard {

    void calculateInterest(double balance) {
        System.out.println("The interest for buying Benz car is "+(4.0/100)*balance);
    }
}