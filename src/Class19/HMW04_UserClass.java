package Class19;

public class HMW04_UserClass {

    // Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through
    // constructor call. Print users name, mobile number and address in userDetails method. Test your code.
    //______________________________________________________________________________________________________________

    String name;
    int mobileNumber;

    public HMW04_UserClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class userInfo extends HMW04_UserClass{
    String address;
    public userInfo(String name, int mobileNumber ,String address) {
       super(name, mobileNumber);
       this.address = address;
    }
    public void userDetails() {
        System.out.println("Name of the user is "+name+", Address is "+address+", Mobile number is : "+mobileNumber);
    }

    public static void main(String[] args) {
        new userInfo("Reshad Gulzada",123546789,"Atlanta(GA)").userDetails();
    }
}