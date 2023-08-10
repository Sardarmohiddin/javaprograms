//Create a class called "Employment" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that takes arguments for each variable and initializes the object.
class Employment
  {
    String empName,designation;
    double salary;
    Employment(String n,String d,double s)
    {
      empName=n;
      designation=d;
      salary=s;
      System.out.println("the employe name is "+empName);
      System.out.println("designation of employee is "+designation);
      System.out.println("salary of a employee is "+salary);
    }
    public static void main(String args[])
    {
      Employment emp=new Employment("sowjanya","mentor",30000);
    }
  }