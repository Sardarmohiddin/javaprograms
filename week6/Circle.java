//Create a class called "Circle" with an instance variable for storing the radius. Implement a constructor that takes the radius as an argument and initializes the object.
class Circle
  {
   float pie;
    float radius;
    Circle(float r,float p)
    {
      radius=r;
      pie=p;
    }
    public void area()
    {
    System.out.println("the area of a circle is "+(pie*radius*radius));
    }
    public static void main(String args[])
    {
      Circle circle=new Circle(5.2f,3.14f);
      circle.area();
    }
  }