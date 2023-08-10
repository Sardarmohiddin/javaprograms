

import java.util.*;

class ExceptionEx

  {

    public static void validateAge(int age) throws ArithmeticException

    {

      if(age<18)

      {

        throw new ArithmeticException("you can't elligible to cast your vote");

      }

      else

        System.out.println("you are elligible to vote");

    }

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      System.out.println("enter your age");

      int age=sc.nextInt();

      try{

      validateAge(age);

      }

      catch(ArithmeticException e)

        {

          System.out.println("cathc block caught the exception");

        }

      System.out.println("exception is handled");

    }

  }