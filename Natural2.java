// WAP to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.Scanner;
class Natural2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number from where you want to print");
     
      int num=sc.nextInt();
       System.out.println("  ");
      for(int i=num;i>0;i--)
        {
          System.out.println(i);
        }
    }
  }