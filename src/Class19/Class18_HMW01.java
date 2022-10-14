package Class19;

public class Class18_HMW01 {

    String name;
    String address;
    public Class18_HMW01(String name,String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo(){
        System.out.println("Name "+name+" Address "+address);
    }

    public static void main(String[] args) {
        Class18_HMW01 josh=new Class18_HMW01("Naughty Josh","Earth");
        josh.displayInfo();
    }
}

