//Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement a method named initializeAccount that takes arguments for each variable and initializes the object. Implement another method named displayAccountDetails to display the account holder's name and balance.
class Bankaccount
  {
    String accountHolder;
    double accountBalance;
    public void InitializeAccount(String a,double b)
    {
      accountHolder=a;
      accountBalance=b;
    }
      public void displayAccountDetails()
        {
        System.out.println("name of a customer"+accountHolder);
          System.out.println("account balance of a user is"+accountBalance);
        }
    public static void main(String args[])
    {
      Bankaccount bankaccount=new Bankaccount();
      bankaccount.InitializeAccount("sardar", 10225425.66);
      bankaccount.displayAccountDetails();
    }
    }
  