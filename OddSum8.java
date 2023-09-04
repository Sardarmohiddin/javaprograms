
import java.util.Scanner;
class OddSum8
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int oddsum=0;
      for(int i=1;i<=num;i++)
        {
          if(i%2==1)
          {
            oddsum=oddsum+i;
          }
        }
      System.out.println("the odd numbers sum upto" +num+ " "+"is"+" "+oddsum);
    }
  }