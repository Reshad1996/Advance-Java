package Class26;

import java.util.HashSet;

public class HMW06_StudentName {

         /* Create a Set collection that will hold Objects of Student Type.
            In this set we do not care about the insertion order. Each student object should have name and studentID.
            Display name of each student.
         */

    String stuName;
    int stuId;

    public HMW06_StudentName(String name, int id) {
        this.stuName = stuName;
        this.stuId = stuId;
    }
    public String PrintInfo() {
        return stuName;
    }
}

class Test {

    public static void main(String[] args) {

        HMW06_StudentName student01 = new HMW06_StudentName("Reshad",123);
        HMW06_StudentName student02 = new HMW06_StudentName("Shahir",456);
        HMW06_StudentName student03 = new HMW06_StudentName("Srosh",789);

        HashSet<HMW06_StudentName> student = new HashSet<>();
        student.add(student01);
        student.add(student02);
        student.add(student03);

        for (var stu:student) {
            System.out.println(stu.PrintInfo());
        }

    }
}


