package Class20;

public class Class19_HMW01 {
    public static void main(String[] args) {
        //  C c=new C();
      //  B b= new B();

    }

   public class A{
        A(){
            System.out.println("A");
        }
    }
     class B extends A{
        B(){
            System.out.println("B");
        }
    }

    class C extends B{
        C(){
            System.out.println("C");
        }
    }
}
