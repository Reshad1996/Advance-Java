package Class23;

public class Class22_HMW1 {

    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes.
    Write example of achieving run time polymorphism.
    */

    public static void main(String[] args) {
        Student[] arr={new CollegeStudent(),
                new SchoolStudent(),new SyntaxStudent()};

        for (Student st:arr
        ) {
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}

class Student{
    void study(){
        System.out.println("students must study");
    }
    void doHomeWork(){
        System.out.println("Students must solve their homeworks");
    }
    void doPractice(){
        System.out.println("Students must practice to get good marks");
    }
}
class SyntaxStudent extends Student{

    @Override
    void doHomeWork() {
        System.out.println("Syntax students must solve all Repls three time ");
    }

    @Override
    void doPractice() {
        System.out.println("Syntax student must do their own research and practice ");
    }

}
class CollegeStudent extends Student{

    @Override
    void doPractice() {
        System.out.println("College students must practice to get good marks");
    }
}
class SchoolStudent extends Student{

}