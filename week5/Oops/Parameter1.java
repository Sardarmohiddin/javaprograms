

//without return type with parameters

import java.util.Scanner;

class Sample

  {

    public void addition(int a,int b)

    {

      System.out.println("the sum is"+(a+b));

    }

    public static void main(String args[])

    {

      Sample s=new Sample();

      //s.addition(23,78);

      Scanner sc=new Scanner(System.in);

      System.out.println("enter a value");

      int a=sc.nextInt();

      System.out.println("enter b value");

      int b=sc.nextInt();

      s.addition(a,b);

    }

  }