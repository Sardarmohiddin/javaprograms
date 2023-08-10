//Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object with .
import java.util.*;
class Person
  {
    String pname,address;
    int age;
    Person(String p,String a,int ag)
    {
     pname=p;
      address=a;
      age=ag;
    }
    public void display()
    {
      System.out.println("the persons name is "+pname);
      System.out.println("the persons address is "+address);
      System.out.println("the age of a person is "+age);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Person person[]=new Person[3];
      for(int i=0;i<person.length;i++)
        {
          System.out.println("enter the person name");
      System.out.println("enter the persons address  ");
      System.out.println("enter the age of a person");
          
          person[i]=new Person(sc.nextLine(),sc.nextLine(),sc.nextInt());
        }
    }
  }