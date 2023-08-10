interface Person
  {
    void insert();
    void display();
  }
interface Student
  {
    void insert();
    //void print();
  }
class Details implements Person,Student
  {
    int id;
    String name;
    String address;
    public void insert()
    {
     System.out.println("inserting");
    }
    public void print()
    {
      System.out.println("printing");
    }
    public void display()
    {
      System.out.println("Displaying all the details");
    }
  }
class MultipleInheritanceEx
  {
    public static void main(String args[])
    {
      Person person=new Details();
   //Student student=new Details();
      person.insert();
      person.display();
      //person.print();

  }
  }