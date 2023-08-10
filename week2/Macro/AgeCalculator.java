import java.util.Scanner;
class AgeCalculator
  {
    public static void main(String args[])
    {
      int current_year=2023;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the year of birth");
      int dob=sc.nextInt();
      int age=current_year-dob;
      System.out.println("Age is "+age+"years");
      if(age>=18)
      {
        System.out.println("User is an adult");
      }
      else
      {
        System.out.println("User is minor");
      }
   }
  }