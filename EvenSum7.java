//WAP to find sum of all even numbers between 1 to n
import java.util.Scanner;
class EvenSum7
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int evensum=0;
      for(int i=1;i<=num;i++)
        {
          if(i%2==0)
          {
            evensum=evensum+i;
          }
        }
      System.out.println("sum of all even numbers between 1 to "+num+" "+"is"+ " "+evensum);
    }
  }