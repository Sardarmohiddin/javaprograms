//over riding is done in the two classes and have relation like inheritance between them
class Shape
  {
    void area(int length,int breadth)
    {
      System.out.println("the area of a rectangle is "+length*breadth);
    }
    void area(double r,double pie)
    {
      System.out.println("the area of a circle is "+(pie*r*r));
    }
    void area(int side)
    {
      System.out.println("the area of a square is "+side*side);
    }
    void area(int base,double height)
    {
     System.out.println("the area of a triangle is "+(0.5*base*height)); 
    }
  }
class Overload
  {
    public static void main(String args[])
    {
      Shape s=new Shape();
      s.area(10,5);
      s.area(2.5,4.0);
      s.area(5);
      s.area(10,2.5);
    }
  }