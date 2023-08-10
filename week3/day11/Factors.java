import java.util.Scanner;
class Factors
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number for finding the factors");
      int n=sc.nextInt();
      System.out.println("Factors of "+ n + " are");
      int count=0;
      for(int i=1;i<=n;i++)
        {
         if(n%i==0) {
           System.out.println(i);
           count++;
        }
        }
      if(count==2)
        System.out.println("prime number");
      else
        System.out.println("not a prime");
  }
  }