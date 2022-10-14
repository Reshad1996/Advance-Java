package Class18;

public class Class17_HMW02 {
    // Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables.
    // ______________________________________________________________________________________________________

    String name;
    double subject1;
    double subject2;
    double subject3;

   Class17_HMW02(String studentName, double sub1, double sub2, double sub3) {
      name = studentName;
      subject1 = sub1;
      subject2 = sub2;
      subject3 = sub3;
   }

   void calculatePrintAvgGrade() {
       System.out.println(name+" "+(subject1+subject2+subject3)/3);
   }

    public static void main(String[] args) {
        new Class17_HMW02("Reshad",100,100,100).calculatePrintAvgGrade();
    }
}
