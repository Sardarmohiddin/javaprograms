/*Assignment 3: Method Overloading and Overriding Combined
Create a class BankAccount with methods deposit and withdraw. Implement method overloading to handle different variations of deposit and withdraw methods:
deposit(amount): Deposits the given amount.deposit(amount, description): Deposits the given amount with a provided description.withdraw(amount): Withdraws the given amount.withdraw(amount, description): Withdraws the given amount with a provided description.*/
class Account
  {
    void deposit(int amount)
    {
     System.out.println("the amount deposited is "+amount);
    }
    void deposit(int amount,String description)
    {
     System.out.println("the amount deposited is "+amount+" "+description);
    }
     void withdraw(int amount)
    {
     System.out.println("the withdraw amount is "+amount);
    }
    void withdraw(int amount,String description)
    {
     System.out.println("the withdraw amount is "+amount+" "+description);
    }
  }
class BankAccount
  {
    public static void main(String args[])
    {
      Account a=new Account();
      a.deposit(1500);
      a.deposit(3500,"deposit successful");
      a.withdraw(1200);
      a.withdraw(1000,"withdraw successful");
    }
  }