import java.util.Scanner;
class MaxOf3
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=sc.nextInt();
      System.out.println("Enter b value");
      int b=sc.nextInt();
      System.out.println("Enter c value");
      int c=sc.nextInt();
      if((a>=b)&&(a>c))
      {
        System.out.println(a +" is "+ "large number");
      }
        else if(b>c)
        {
        System.out.println(b +" is "+ "large number");
        }
      else
        {
         System.out.println(c +" is "+ "large number");
      }
    }
  }