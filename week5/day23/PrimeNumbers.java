import java.util.Scanner;
class PrimeNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the range up to where we have to print the prime numbers");
      System.out.println("enter the starting point");
      int start=sc.nextInt();
      System.out.println("enter the ending point");
      int end=sc.nextInt();
      for(int i=start;i<=end;i++)
        {
          int count=0;
          for(int j=1;j<=i;j++)
            {
              if(i%j==0)
              {
                count++;
              }
            }
          if(count==2)
            System.out.println(i);
          else
            continue;
          }
    }
  }