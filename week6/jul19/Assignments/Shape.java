/*Hierarchical Inheritance

Create a superclass called "Shape" with the following attributes:
String color
double radius
double length
double width*/
class Shape
  {
  double length,width;
  
    String color="red";
  }
class Rectangle extends Shape
  {
    
    double length,width;
    Rectangle(double len,double wid)
    {
      length=len;
      width=wid;
      System.out.println("area is "+(length*width));
      System.out.println("color of a rectangle is "+color);
    }
    
  }
    class Circle extends Shape
      {
       
        double radius;
      float pie=3.14f;
         Circle(double ra)
        {
          radius=ra;
          System.out.println("area of a circle is "+(pie*radius*radius));
         System.out.println("the color of a circle is "+color);
        }
          public static void main(String args[])
            {
            Rectangle r=new Rectangle(5.5,4.2);
             Circle c=new Circle(5.8564);
            
            }
        }
      
  