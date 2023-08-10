/*Assignment 1: Create a Class with Encapsulation

Create a class named "Person" with private attributes: name, age, and email.
Provide public getter and setter methods for each attribute.
Write a displayInfo() method within the class to display all the details of the person.
In the main method, create an object of the class and set values for the attributes using setter methods. Then, call the displayInfo() method to show the details of the person.*/
class Person
  {
    private String name,email;
    private int age;
    public void setName(String name)
    {
      this.name=name;
    }
    public void setEmail(String email)
    {
      this.email=email;
    }
    public void setAge(int age)
    {
      this.age=age;
    }
    public String getName()
    {
      return name;
    }
    public String getEmail()
    {
      return email;
    }
    public int getAge()
    {
      return age;
    }
    public void display()
    {
      System.out.println("name :"+getName()+" "+"email :"+getEmail()+" "+"age :"+getAge());
    }
  }
class P1
  {
    public static void main(String args[])
    {
      Person person=new Person();
      person.setName("sardar");
      person.setEmail("sardar@gmail.com");
      person.setAge(24);
      person.display();
    }
  }