public class TesterBank {
  public static void main(String[] args) {

    BankAccount test = new BankAccount(123123123, "spearmint");
    System.out.println(test.getBalance());
    System.out.println(test.getAccountID());
    System.out.println(test.deposit(400));
    System.out.println(test.getBalance());
    System.out.println(test.withdraw(500));
    System.out.println(test.toString());

     }
}
