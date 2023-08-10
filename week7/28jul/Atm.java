/*Assignment 6: Custom Exception in Banking Application Build a simple banking application in Java. Create a custom checked exception named InsufficientFundsException, which will be thrown when a user tries to withdraw an amount that exceeds their account balance. Implement classes for bank accounts, and provide methods for depositing and withdrawing money. Throw the InsufficientFundsException when a withdrawal amount is greater than the available balance. Handle this exception in an appropriate way and display a user-friendly error message.*/
import java.util.*;
class InsufficientFundsException extends Exception
  {
    InsufficientFundsException(String msg)
    {
    super(msg);
    }
  }
class WithdrawlAmount
{
  static int amount=20000;
  int bal=0;
 
  public  void withdrawl(int withdraw) throws InsufficientFundsException
  {
    if(amount<withdraw)
    {
      throw new InsufficientFundsException("insufficient funds");
    }
    else
    {
      System.out.println("withdrawl is succesful");
      bal=amount-withdraw;
      System.out.println("the sufficient balance is "+bal);
  }
}
}
public class Atm
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      WithdrawlAmount w=new WithdrawlAmount();
      
    
      System.out.println("enter the amount you want to withdraw");
      int withdraw=sc.nextInt();
      
      try{
        w.withdrawl(withdraw);
      }
      catch(InsufficientFundsException e)
        {
          System.out.println(e);
        }
      System.out.println("exception is handled");
    }
  }
