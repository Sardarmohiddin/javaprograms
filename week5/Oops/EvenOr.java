

//with return type with parameters

import java.util.Scanner;

class Sample

  {

    public static void main(String args[])

    {

      Sample s=new Sample();

      Scanner sc=new Scanner(System.in);

      System.out.println("enter the number");

      int number=sc.nextInt();

      boolean result=s.evenOrOdd(number);

      System.out.println(result);

     // System.out.println(s.evenOrOdd(number));

    }

    public boolean evenOrOdd(int number)

    {

      if(number%2==0)

        return true;

      else

        return false;

    }

  }