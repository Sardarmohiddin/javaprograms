import java.util.Scanner;
class ASCII
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the character");
      char ch=sc.next().charAt(0);
      int ascii=ch;
      System.out.println("ASCII value of "+ch+" is "+ascii);
    }
    }