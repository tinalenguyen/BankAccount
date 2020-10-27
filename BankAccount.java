public class BankAccount {

//instance variables
private double balance;
private int accountID;
private String password;

//constructor

public BankAccount (int accountnum, String pass){

 accountID = accountnum;
 password = pass;
 balance = 0;

}
public String toString() {
  return accountID + "\t" + balance;


}

public double getBalance(){
  return balance;

}

public int getAccountID(){
  return accountID;

}

public void setPassword(String newPass){
  password = newPass;

}





}
