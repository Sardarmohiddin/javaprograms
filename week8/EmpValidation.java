/*Create a Java program that manages an array of Employee objects. Each Employee object should have the following attributes:
employeeId: A unique 4-digit identifier for the employee.
employeeName: The name of the employee (between 3 and 40 characters).
mobileNumber: The employee's mobile number, a 10-digit string that starts with 9, 8, 7, or 6.
salary: The employee's salary, a positive integer not exceeding 1,000,000.
The program should allow the user to input data for each employee dynamically with the following validations:
employeeId: Ensure it's a unique 4-digit identifier.
employeeName: Validate that it contains only letters and is between 3 and 40 characters.
mobileNumber: Confirm that it's a 10-digit number starting with 9, 8, 7, or 6.
salary: Validate that it's a positive integer and doesn't exceed 1,000,000.
 After collecting the data for five employees, display the details for all five employees.
Your program should implement these requirements and ensure that the data collected is accurate and follows the provided validation rules.*/
import java.util.Scanner;
class EmployeeDetails
  {
    int eid;
    String ename;
    String mobileno;
    double salary;
    EmployeeDetails(int eid,String ename,String mobileno,double salary)
    {
      this.eid=eid;
      this.ename=ename;
      this.mobileno=mobileno;
      this.salary=salary;
    }
  /*  public void validateEid(EmployeeDetails emp,int eid)
    {
      for(int i=0;i<size;i++)
        {
      if(i==0)
      {
        continue;
      }
          else{
            for(int j=0;j<size;i++)
              {
              
              }
          }
    }*/
    public void validateEname(String ename)
    {
      if(ename.length()>=3&&ename.length()<=40)
      {
        System.out.println(" valid name");
      }
      else{
        System.out.println("Invalid employee name");
      }
    }
    public void validateMobileno(String mobileno)
    {
      if(mobileno.length()==10&&(mobileno.startsWith("9")||mobileno.startsWith("8")||mobileno.startsWith("7")||mobileno.startsWith("6")))
      {
        System.out.println(" valid mobileno");
      }
      else{
        System.out.println("Invalid mobile number");
      }
    }
    public void validateSalary(double salary)
    {
      if((salary<=1000000)&&(salary>=0))
      {
        System.out.println("valid salary");
      }
      else{
        System.out.println("Invalid salary");
      }
    }
    public void display()
    {
      System.out.println(eid+" "+ename+" "+mobileno+" "+salary);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
     // EmployeeDetails ed=new EmployeeDetails();
      System.out.println("enter how many employee details you have to store");
      int size=sc.nextInt();
      EmployeeDetails emp[]=new EmployeeDetails[size];
      for(int i=0;i<size;i++)
        {
          System.out.println("enter employee "+(i+1)+"details");
          System.out.println("enter id");
          int eid=sc.nextInt();
          System.out.println("enter name");
          String ename=sc.next();
          System.out.println("enter mobile number");
          String mobileno=sc.next();
          System.out.println("enter the salary");
          double salary=sc.nextDouble();
          emp[i].validateEname(ename);
          emp[i].validateSalary(salary);
          emp[i].validateMobileno(mobileno);
          emp[i]=new EmployeeDetails(eid,ename,mobileno,salary);
        }
      for(int i=0;i<size;i++)
        {
          emp[i].display();
        }
    }
    }