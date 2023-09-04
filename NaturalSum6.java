// WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
class NaturalSum6
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int sum=0;
      for(int i=1;i<=num;i++)
        {
          sum=sum+i;        
        }
      System.out.println("the sum of " +num+" " +"natural numbers is "+sum);
    }
  }
