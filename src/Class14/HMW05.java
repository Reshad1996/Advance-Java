package Class14;

public class HMW05 {

    // Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String Email(String name,String lastName,String gmail) {
        String Email = name +" "+ lastName + "@" + gmail + ".com";
        return Email;
    }

    public static void main(String[] args) {
        HMW05 email = new HMW05();
        System.out.println(email.Email("Reshad","Gulzada","gmail"));
    }
}
