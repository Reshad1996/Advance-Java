package Class21;

public class HMW01_Degree {

    // Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    // Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    // Call the method by creating an object of each of the three classes.
    //_____________________________________________________________________________________________________________________
    public static void main(String[] args) {
         Degree obj = new Degree();
         obj.getPrerequisite();
         Bachelors obj1 = new Bachelors();
         obj.getPrerequisite();
         Masters obj2 = new Masters();
         obj2.getPrerequisite();
    }
}
 class Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma.");
    }
 }
 class Bachelors extends Degree{
     public void getPrerequisite() {

     }
 }
 class Masters extends Degree{
     public void getPrerequisite() {
         System.out.println("To get a Master degree you need a Bachelor degree.");
     }
 }