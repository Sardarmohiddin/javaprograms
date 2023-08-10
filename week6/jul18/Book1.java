//through methods initializing the instance variables and using array objects
import java.util.*;
class Book1
  {
    String bookname,author;
    int id,yearofPublish,price;
    public void display()
    {
      System.out.println("book name is "+bookname);
      System.out.println("author name is "+author);
      System.out.println("book id no is :"+id);
      System.out.println("year of publish is "+yearofPublish);
      System.out.println("the price of the book is "+price);
    }
    public void setdata(String bn,String a,int i,int y,int pr)
    {
     bookname=bn;
      author=a;
      id=i;
      yearofPublish=y;
      price=pr;
    }
    public static void main(String args[])
    {
      Book1 book1[]=new Book1[4];
      for(int i=0;i<book1.length;i++)
        {
          Scanner sc=new Scanner(System.in);
          book1[i]=new Book1();
          System.out.println("enter the book name");
          System.out.println("enter the author name");
          System.out.println("enter the id number");
          System.out.println("enter the publish year");
          System.out.println("enter the price");
          book1[i].setdata(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
      for(int i=0;i<book1.length;i++)
        {
          book1[i].display();
        }
    }
  }
