/*Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.*/
import java.util.Scanner;
class NetSalary
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the employee monthly salary");
      double salary=sc.nextDouble();
      double Annual_salary=(salary*12);
      System.out.println("Annual salary is "+Annual_salary);
      if(Annual_salary<500000)
      {
        System.out.println("Annual income is less than 5 lakhs so there is no tax reduction");
        double Net_salary=Annual_salary;
        System.out.println("Net salary of an employee is "+Net_salary);
      }
      else if((Annual_salary>=500000)&&(Annual_salary<=600000))
      {
        double tax_amount=(Annual_salary*5)/100;
        System.out.println("tax amount is "+tax_amount);
        double Net_salary=Annual_salary-tax_amount;
        System.out.println("Net salary of an employee is "+ Net_salary);
      }
      else if((Annual_salary>600000)&(Annual_salary<=800000))
      {
        double tax_amount=(Annual_salary*10)/100;
        System.out.println("tax amount is "+tax_amount);
        double Net_salary=Annual_salary-tax_amount;
        System.out.println("Net salary of an employee is "+Net_salary);
      }
      else if((Annual_salary>800000)&&(Annual_salary<=1000000))
      {
       double tax_amount=(Annual_salary*15)/100;
        System.out.println("tax amount is "+tax_amount);
        double Net_salary=Annual_salary-tax_amount;
        System.out.println("Net salary of an employee is "+Net_salary); 
      }
      else
      {
        double tax_amount=(Annual_salary*20)/100;
        System.out.println("tax amount is "+tax_amount);
        double Net_salary=Annual_salary-tax_amount;
        System.out.println("Net salary of an employee is "+Net_salary);
      }
    }
   }