//creating the program by reading the data through keyboard and creating diiferent objects.
import java.util.*;
class Book
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
    public static void main(String args[])
    {
      Book book[]=new Book[5];
      for(int i=0;i<book.length;i++)
        {
          Scanner sc=new Scanner(System.in);
          book[i]=new Book();
          System.out.println("enter the book "+(i+1)+"details");
          System.out.println("enter the name of a book");
          book[i].bookname=sc.next();
          System.out.println("enter  the author name");
          book[i].author=sc.next();
          System.out.println("enter the book id");
          book[i].id=sc.nextInt();
          System.out.println("enter the year of publish");
          book[i].yearofPublish=sc.nextInt();
          System.out.println("enter the price of a book");
          book[i].price=sc.nextInt();
        }
          for(int i=0;i<book.length;i++)
            {
              book[i].display();
            }
          
        }
    }
  