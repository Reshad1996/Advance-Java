package Class15;

public class Student {

    // create a class and name it Student
    // create a variables Nama , ID , numberOFstudent
    // create three objects of the student class
    // set the value for studentName , studentID , and increement the numberOfStudent for each object
    // print out total number of student
    //________________________________________________________________________________________________

    String name;
    String id;
    static int  numberOfStudent;

    public static void main(String[] args) {
        Student reshad = new Student();
        reshad.name = "reshad";
        reshad.id = "123";
        Student.numberOfStudent++;

        Student kawsar = new Student();
        kawsar.name = "kawsar";
        kawsar.id = "123";
        Student.numberOfStudent++;

        System.out.println(Student.numberOfStudent);

    }
}
