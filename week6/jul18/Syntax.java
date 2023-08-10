/* [11:09 AM] Sowjanya Uppu

Syntax:

 

datatype arrayname[]=new datatype[size];

 

Student student[]=new Student[3];

Employee employee[]=new Employee[2];

 

Person person[]=new Person[5];

Book book[]=new Book[6];
*/



//using for loops for more creating and printing the objects

//initializing the object using instance variables through array of objects

import java.util.*;

class Students

  {

    String name;

    int rollno;

    String address;

    public void display()

    {

      System.out.println("student details are");

      System.out.print("name :"+name+" "+"rollno : "+rollno+" "+"address : "+address);

    }

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      Students student[]=new Students[3];

      for(int i=0;i<student.length;i++)

        {                       

          student[i]=new Students();

          System.out.println("enter student "+(i+1));

          System.out.println("enter name");

          student[i].name=sc.next();

          System.out.println("enter rollno");

          student[i].rollno=sc.nextInt();

          System.out.println("enter address");

         student[i].address=sc.next();

        }

      for(int i=0;i<student.length;i++)

        {

          student[i].display();

        }


    }

  }
----------------------------------------------------------------
  //[2:59 PM] Sowjanya Uppu
  //we use static keyword variable before when the common variables are being used morely.it helps in memory management and saves the space by giving memory in runtime only once when class loader()performing the compilation

class Student

  {

    String studentName;

    int studentRollno;

    static String clgname="kbn";


    public static void main(String args[])

    {

     Student st=new Student();

      st.studentName="pushpa";

      st.studentRollno=123;

      Student st1=new Student();

      st1.studentName="vamsi";

      st1.studentRollno=345;

      System.out.println(st.studentName+" "+st.studentRollno+" "+clgname);

      System.out.println(st1.studentName+" "+st1.studentRollno+" "+clgname);


    }

  }
--------------------------------
  ////display the book details by initializing the object using methods through array of objects
import java.util.Scanner;

class Book {
  String title;
  int id;
  String author;
  int year;

  public void displayDetails() {
    System.out.println(title + " " + id + " " + author + " " + year);
  }

  public void setDetails(String t, int i, String a, int y) 
  {
    title = t;
    id = i;
    author = a;
    year = y;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("how many number of books");
    int count = sc.nextInt();
    Book b[] = new Book[count];
    for (int i = 0; i < count; i++)// i=0//i=1//i=2
    {
      System.out.println("enter book" + (i + 1) + " details");
      b[i] = new Book();
      System.out.println("enter the title of the book");
      // String bname=sc.next();
      System.out.println("enter the id of the book");
      // int bid=sc.nextInt();
      System.out.println("enter author of the book");
      // String bauthor=sc.next();
      System.out.println("enter year");
      // int byear=sc.nextInt();
      // b[i].setDetails(bname,bid,bauthor,byear);
      b[i].setDetails(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
    }
    for (int i = 0; i < count; i++) {
      b[i].displayDetails();
    }
  }
}
----------------------------------------
  

//static block is used to initialize the static variables 

class staticEx

  {

    static int a;

    static{

      a=10;

      System.out.println("static block");

        }

    public static void main(String args[])

    {

      System.out.println(a);

    }


  }