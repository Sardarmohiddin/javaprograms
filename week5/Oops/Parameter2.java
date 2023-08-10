import java.util.Scanner;
class Sample

  {

    public void addition()

    {

     // int a=40,b=50;

     Scanner sc=new Scanner(System.in);

      System.out.println("enter a and b values");

      int a=sc.nextInt();

      int b=sc.nextInt();

      System.out.println("the sum is"+(a+b));

    }

    public static void main(String args[])

    {

      Sample s=new Sample();


      s.addition();

    }

  }