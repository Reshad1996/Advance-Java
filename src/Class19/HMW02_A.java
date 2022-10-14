package Class19;

public class HMW02_A {

    // Write program to inherit class A that has method printF which is static and call or reuse that method into class B.
    //__________________________________________________________________________________________________________________--

    static void printF() {
        System.out.println("This method is static");
    }
}

class HMW02_B extends HMW02_A {
    public static void main(String[] args) {
        HMW02_B.printF();
    }

}