/*[12:01 PM] Sowjanya Uppu

Assignment 1: Shape Hierarchy

Create an abstract class called "Shape" that has the following abstract methods:

get_area(): Returns the area of the shape.
get_perimeter(): Returns the perimeter of the shape.

Create concrete classes Circle, Rectangle, and Triangle that inherit from the abstract class "Shape." Implement the required methods for each class.

Write a program to:

Create instances of Circle, Rectangle, and Triangle.
Prompt the user to enter dimensions for each shape.
Calculate and display the area and perimeter of each shape.


Assignment 3: Animal Hierarchy

Create an abstract class called "Animal" with the following abstract methods:

speak(): Outputs the sound that the animal makes.
move(): Describes how the animal moves.

Create concrete classes Dog, Cat, and Bird that inherit from the abstract class "Animal." Implement the required methods for each class.

Write a program to:

Create instances of Dog, Cat, and Bird.
Display the sound and movement of each animal.*/
abstract class Shape
  {
    abstract void get_Area();
    abstract void get_Perimeter();
  }
class Rectangle extends Shape{
  static int len=10;
  static int bre=5;
  public void get_Area()
  {
   
    System.out.println("area of a rectangle is "+len*bre);
  }
  public void get_Perimeter()
  {
    System.out.println("perimeter of a rectangle is "+2*(len+bre));
  }
}
class Circle extends Shape{
  static int radius=10;
  public void get_Area()
  {
    System.out.println("area of a circle is "+(3.14*radius*radius));
  }
  public void get_Perimeter()
  {
    System.out.println("the perimeteer or circumference of a circle is "+(2*3.14*radius));
  }
}
class Triangle extends Shape{
  static int base=4;
  static int height=3;
  public void get_Area()
  {
    System.out.println("area of a triangle is :"+(0.5*base*height));
  }
  public void get_Perimeter()
  {
    System.out.println("the perimeter of a equialateral traiangle is "+(3*base));//a+b+c for 3 different sides
  }
}
class Shapes
  {
    public static void main(String args[])
    {
      Rectangle rec=new Rectangle();
      Circle c=new Circle();
      Triangle tri=new Triangle();
      rec.get_Area();
      rec.get_Perimeter();
      c.get_Area();
      c.get_Perimeter();
      tri.get_Area();
      tri.get_Perimeter();
    }
  }