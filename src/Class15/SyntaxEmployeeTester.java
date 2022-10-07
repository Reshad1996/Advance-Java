package Class15;

public class SyntaxEmployeeTester {

    public static void main(String[] args) {
        SyntaxEmployee reshadEmp = new SyntaxEmployee();
        reshadEmp.empID = "123";
        reshadEmp.salary = "80k";
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee kawsarEmp = new SyntaxEmployee();
        kawsarEmp.empID = "456";
        kawsarEmp.salary = "100k";
        System.out.println(SyntaxEmployee.CEO);
    }
}
