
//WAP to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
class Natural1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the number upto which you want to print the natural numbers");
    int natural=sc.nextInt();
    int i=1;
    while(i<=natural)
      {
        System.out.println(i);
        i++;
      }
  }
}