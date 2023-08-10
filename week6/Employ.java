//Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details.
class Employ
  {
    String employName,designation;
    int salary;
    public void setEmployeeDetails(String e,String d,int s)
    {
      employName=e;
      designation=d;
      salary=s;
    }
    public void displayEmployeeDetails()
    {
      System.out.println("employee name is "+employName);
      System.out.println("designation is"+designation);
      System.out.println("the salary  of a employee is"+salary);
    }
    public static void main(String args[])
    {
      Employ e= new Employ();
      e.setEmployeeDetails("sardar","developer",20000);
      e.displayEmployeeDetails();
    }
  }