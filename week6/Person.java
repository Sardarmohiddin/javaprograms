//Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.
class Person
  {
    String pname,address;
    int age;
    Person(String p,String a,int ag)
    {
     pname=p;
      address=a;
      age=ag;
    }
    public void display()
    {
      System.out.println("the persons name is "+pname);
      System.out.println("the persons address is "+address);
      System.out.println("the age of a person is "+age);
    }
    public static void main(String args[])
    {
      Person person=new Person("sardar","vijayawada",23);
      person.display();
    }
  }