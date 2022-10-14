package Class20;

public class HMW04_Salary {

    // Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    //________________________________________________________________________________________

    private void Salary(String name , String company) {
        System.out.println(name+" is working for "+company+" Bank.");
    }
    private void Salary(String name ,String company, String position) {
        System.out.println("The position that he  works as a  "+position+".");
    }
    private void Salary(String name ,String company, int salary) {
        System.out.println("And he earns approximately "+salary+" per year.");
    }

    public static void main(String[] args) {
        HMW04_Salary obj = new HMW04_Salary();
        obj.Salary("Reshad Gulzada","Wells Fargo");
        obj.Salary("Reshad Gulzada","Wells Fargo","Automation Tester");
        obj.Salary("Reshad Gulzada","Wells Fargo",130000);
    }
}
