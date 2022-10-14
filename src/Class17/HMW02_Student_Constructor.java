package Class17;

public class HMW02_Student_Constructor {

    // Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables.
    // ______________________________________________________________________________________________________

    String name;
    private double mathMarks;
    private double biologyMarks;
    private double chemistryMarks;

    HMW02_Student_Constructor(String studentName, double studentMathMarks, double studentBiologyMarks, double studentChemistryMarks ) {
         name           = studentName;
         mathMarks      = studentMathMarks;
         biologyMarks   = studentBiologyMarks;
         chemistryMarks = studentChemistryMarks;
    }

    void averageGrade () {
        double averageGrade = (mathMarks+biologyMarks+chemistryMarks)/3;
        System.out.println(name+" average grade is "+averageGrade);
    }
}
