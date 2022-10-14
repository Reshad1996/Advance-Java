package Class17;

public class HMW03_Constructor {

    // Write a java class that have 4 constructors with 4 different access levels of
    // constructors(private,public,default,protected) and create 4 objects of this
    // class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    // and observe result.
    //______________________________________________________________________________________________________________

     String name;
     String team;
     String position;
     String sponserCompany;
     String country;

   private HMW03_Constructor(String playerName, String playerTeam, String playerPosition) {
        name     = playerName;
        team     = playerTeam;
        position = playerPosition;
    }

    void footballer() {
        System.out.println("my name is "+name+" i play for "+team+" team and my position is "+position);
    }

    public HMW03_Constructor(String couchName, String couchTeam ) {
        name    = couchName ;
        team    = couchTeam;
    }
    void footballer1() {
        System.out.println("my name is "+name+" i am the couch of "+team+" team");
    }

    HMW03_Constructor(String spCompany ) {
        sponserCompany = spCompany;
    }

    void footballer2() {
        System.out.println("The company which sponser the Real Madrid team is "+sponserCompany);

    }

    protected HMW03_Constructor( ) {

    }

    void footballer3() {
        System.out.println("Soccer is very interesting game ");
    }


    public static void main(String[] args) {
        HMW03_Constructor obj1 = new HMW03_Constructor("Reshad","Real Madrid","Forward");
        obj1.footballer();
        HMW03_Constructor obj2 = new HMW03_Constructor("zaidan","Real Madrid");
        obj2.footballer1();
        HMW03_Constructor obj3 = new HMW03_Constructor("addidas");
        obj3.footballer2();
        HMW03_Constructor obj4 = new HMW03_Constructor();
        obj4.footballer3();


    }
}
