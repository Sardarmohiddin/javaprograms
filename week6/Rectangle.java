//Create a class called "Rectangle" with instance variables for storing the length and width of a rectangle. Implement methods to calculate and return the area and perimeter of the rectangle.
class Rectangle
  {
    int length,width;
    {
      public int area()
        {
        int arearec=length*breadth;
        System.out.println("the area of a rectangle is"+arearec);
        
        }
      public int perimeter()
        {
        int perimeterrec=2*(length+breadth);
        System.out.println("the perimeter of a rectangle is"+perimeterrec);
        }
      public static void main(String args[])
        {
        Rectangle rectangle=new Rectangle();
        rectangle.length=10;
        rectangle.breadth=20;
        rectangle.area();
        rectangle.perimeter();
        }
    }
  }