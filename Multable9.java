
//WAP to print multiplication table of any number.
import java.util.Scanner;
class Multable9
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter the table number you want");
      int n=sc.nextInt();
      for(int i=1;i<=10;i++)
        {
        System.out.println(n +"*"+i+"="+n*i);
        }
    }
  }