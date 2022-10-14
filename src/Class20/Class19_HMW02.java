package Class20;

public class Class19_HMW02 {

    // Write program to inherit class A that has method printF which is static and call or reuse that method into class B.
    //_____________________________________________________________________________________________________________
    public static void main(String[] args) {
        Z.printF();
        W.printF();
    }

}
class Z{

    static void printF(){
        System.out.println("F");
    }
}
class W extends Z{

}
