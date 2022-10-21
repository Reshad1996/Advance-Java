package Class22;

public class HMW01 {

    /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
       Define common behavior within parent class and override some of the methods in child classes
       Define some methods specific to child classes
       Write example of achieving run time polymorphism */

}

class Student {

    public void Studious() {
        System.out.println("A student studies to pass their classes.");
    }

    public void procrastinate() {
        System.out.println(("A student leaves assignments for the last minute."));
    }
}

class SyntaxStudent extends Student {

    public void Studious() {
        System.out.println("Syntax students study a lot and are ambitious.");
    }

    public void procrastinate() {
        System.out.println(("Syntax students always complete their assignments on time."));
    }
}

class CollegeStudent extends  Student {

    public void Studious() {
        System.out.println("College students study an adequate amount .");
    }

    public void procrastinate() {
        System.out.println(("College students complete assignments last minute."));
    }

}

class SchoolStudnet extends Student {

    public void Studious() {
        System.out.println("School students rarely study.");
    }

    public void procrastinate() {
        System.out.println(("School students rarely complete their assignments."));
    }
}

class Student_Tester {
    public static void main(String[] args) {

        Student[] student = {new SyntaxStudent(),new CollegeStudent(),new SchoolStudnet() };
        for (Student stu:student){
            stu.Studious();
            stu.procrastinate();
        }

    }
}