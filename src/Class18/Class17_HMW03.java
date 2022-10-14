package Class18;

public class Class17_HMW03 {

    // Write a java class that have 4 constructors with 4 different access levels of
    // constructors(private,public,default,protected) and create 4 objects of this
    // class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    // and observe result.
    //______________________________________________________________________________________________________________

   private Class17_HMW03 () {
       System.out.println("private");
   }

     Class17_HMW03 (String name ) {
        System.out.println("Default");
    }

    protected Class17_HMW03 (int age) {
        System.out.println("protected");
    }

    public Class17_HMW03 (boolean isTrue) {
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Class17_HMW03();
        new Class17_HMW03("Reshad");
        new Class17_HMW03(26);
        new Class17_HMW03(true);
    }
}
