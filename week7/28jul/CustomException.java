

import java.util.*;

class InvalidAgeException extends Exception

  {

    InvalidAgeException(String message)

    {

      super(message);

    }

  }

class AgeValidator

  {

    public static void validateAge(int age) throws InvalidAgeException

    {

      if(age<18)

      {

        throw new InvalidAgeException("not elligible");

      }

      else

        System.out.println("you are elligible");

    }

  }

class CustomException

  {

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      System.out.println("enter age");

      int age=sc.nextInt();

      try{

      AgeValidator.validateAge(age);

      }

      catch(InvalidAgeException e)

        {


          e.printStackTrace();

        }

      System.out.println("Exception handled");


    }

  }