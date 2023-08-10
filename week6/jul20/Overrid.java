//method overloading is used when we want to reduce the readabilty
class Shape
  {
    void area(){
    System.out.println("the shape of an object is");
  }
  }
class Rectangle extends Shape
  {
    void area()
    {
      int length=10;
      int breadth=20;
      System.out.println("the area of a rectangle is "+length*breadth);
    }
  }
    class Circle extends Rectangle{
    void area()
    {
      double r=2.56;
      double pie=3.14;
      System.out.println("the area of a circle is "+(pie*r*r));
    }
    }
    class Square extends Circle{
    void area()
    {
      int side=20;
      System.out.println("the area of a square is "+side*side);
    }
    }
    class Triangle extends Square{
    void area()
    {
      int base=10;
      double height=2.5;
     System.out.println("the area of a triangle is "+(0.5*base*height)); 
    }
  }
class Overrid
  {
    public static void main(String args[])
    {
      Shape s=new Shape();
      s.area();
      Shape rectangle=new Rectangle();
      rectangle.area();
      Shape circle=new Circle();
      circle.area();
      Shape square=new Square();
      square.area();
     Shape tri=new Triangle();
     tri.area();
  }
  }