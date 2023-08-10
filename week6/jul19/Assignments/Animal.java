/*Assignment 1: Single Inheritance

Create a superclass called "Animal" with the following attributes:
String name
int age
String */
class Animal
  {
    String name="jimmy";
    int age=23;
    String breed="german shepherd";
  }
class B extends Animal
  {
    void run()
    {
      System.out.println("it runs daily");
    }
    public static void main(String args[])
    {
      B b=new B();
     System.out.println(b.name); 
    System.out.println(b.age);
      System.out.println(b.breed);
      b.run();
    }
  }