package Class19;

public class HMW01_A {

    // Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    //_______________________________________________________________________________________________________________

    String cup;
    String country;
    int team;

    public HMW01_A(String cup, String country) {
        this.cup = cup;
        this.country = country;

    }
}

class HMW01_B extends HMW01_A{
    int team;
    public HMW01_B(String cup, String country, int team) {
        super(cup,country);
        this.team = team;
    }
}

class HMW01_C extends HMW01_B{

    public HMW01_C (String cup, String country, int team) {
        super(cup, country, team);
    }
    public void printInfo() {
        System.out.println(cup+" Cup is going to be held in "+country+" and "+team+" Nations are going to play ");
    }

    public static void main(String[] args) {
        new HMW01_C("World","Qatar",32).printInfo();
    }
}

