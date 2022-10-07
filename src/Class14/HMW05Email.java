package Class14;

public class HMW05Email {

    // Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String Email(String name,String lastName,String emailType) {
        String Email = (name +"."+lastName + "@" + emailType + ".com").toLowerCase();
        return Email;
    }

    public static void main(String[] args) {
        HMW05Email email = new HMW05Email();
        System.out.println(email.Email("Reshad","Gulzada","gmail"));
    }
}
