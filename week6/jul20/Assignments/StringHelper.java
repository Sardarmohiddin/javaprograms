/*Assignment 1: Method Overloading
Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:
Concatenate two strings.Concatenate three strings.Concatenate a list of strings.*/
import java.util.*;
class StringHelper
  {
    void concatenate(String s1,String s2)
    {
      System.out.println("Concatinate of two Strings "+s1.concat(s2));
    }
    void concatenate(String s1,String s2,String s3)
    {
      String st=s1.concat(s2);
      st=st.concat(s3);
      System.out.println(" Concatenation of Three Strings "+st);
    }
    void concateenate()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the List of Strings to concatenate");
      System.out.println("Enter the No of Strings you want in List");
      int count=sc.nextInt();
      String str[]=new String[count];
      System.out.println("Enter the List of "+count+" Strings");
      for(int i=0;i<count;i++)
        {
          str[i]=sc.next();
        }
      System.out.println("List of Strings After Concatination");
      String concat="";
      for(int i=0;i<count;i++)
        {
          concat=concat+str[i];
        }
      System.out.println(concat);
    }
  }
class ConcatStrings
  {
    public static void main(String[]args)
    {
      StringHelper sh=new StringHelper();
      sh.concatenate("Hi ","Ram");
      sh.concatenate("Hello ","i Am ", "Ram");
      sh.concateenate();
    }
  }