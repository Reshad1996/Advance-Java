package Class16;

public class BankAccount {

    private String username;
    private String password;
    int accountNumber;
    public String bankname;

   public void printBankName() {
       System.out.println(bankname);
    }

   private void printUserName() {
       System.out.println(username);
    }

    void printAccountNumber() {
        System.out.println(accountNumber);
    }
}
