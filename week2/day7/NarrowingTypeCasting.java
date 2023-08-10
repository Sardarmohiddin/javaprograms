import java.util.Scanner;
class NarrowingTypeCasting
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      float number=sc.nextFloat();
      int value=(int)number;
      System.out.println(value);
     }
  } 
