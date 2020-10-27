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

public boolean deposit(double amount){
  if (amount >= 0){
    balance += amount;
    return true;
  }
  else {
    return false;
  }

}
public boolean withdraw(double amount){

  if (amount >= 0 && amount <= balance){
    balance += - amount;
    return true;
  }
  else  return false;

}



}
