//1. ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.
import java.util.*;
class Account
  {
    long accountnum=1000002264;
    float balance=1500.25f;
    String accholderName="sardar";
    void deposit()
    {
      System.out.println("enter the amount you want to deposit");
    
    Scanner sc=new Scanner(System.in);
    int dep_amount=sc.nextInt();
    balance=balance+dep_amount;
System.out.println("the amount is deposited succesfully. the balance is "+balance);
    }
void withdraw()
  {
  System.out.println("enter the amount you want to withdraw");
 int wit_amount=sc.nextInt();
  if(balance>=wit_amount)
  {
    balance=balance-wit_amount;
  System.out.println("withdrawl is succesful and the balance is "+balance);
  }
  }
void checkbalance()
  {
  System.out.println("the reamaining amount in the bank is "+balance);
  }
  }
  
class AtmSimulator extends Account
  {
  
  }