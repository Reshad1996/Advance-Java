package Class14;

public class HMW07 {

    // Create  class Student that will have a method getGrade.
    // Your method should accept the score of a student and return a grade:
    // score > 90 - A
    // score >80 - B
    // score >70 - C
    // score > 50 - D
    // anything else - F

    void Student (int mark) {
        if (mark > 90) {
            System.out.println("Grade is = A");
        }else if (mark > 80) {
            System.out.println("Grade is = B");
        }else if (mark > 70) {
            System.out.println("Grade is = C");
        }else if (mark > 50) {
            System.out.println("Grade is = D");
        }else {
            System.out.println("Grade is = F");
        }
    }

    public static void main(String[] args) {
        HMW07 grade = new HMW07();
        grade.Student(85);
    }
}
