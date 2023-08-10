//Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.
class Book
  {
    String book_title,author;
    int publication_year;
    public void initializeBook(String t,String a,int y)
    {
     book_title=t;
      author=a;
      publication_year=y;
    }
    public void display()
    {
      System.out.println("the title of a book is "+book_title);
      System.out.println("the author of a book is "+author);
      System.out.println("the publication of book is"+publication_year);
    }
    public static void main(String args[])
    {
      Book bk=new Book();
      bk.initializeBook("wings of fire","abdul kalam",1987);
      bk.display();
    }
  }