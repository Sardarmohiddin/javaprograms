/*
Assignment 3: Student Information System

Create a class named "Student" with private attributes: name, rollNumber, age, and marks.
Implement getter and setter methods for all attributes.
Ensure that the marks attribute can only be accessed through getter and setter methods, not directly.
Add a method named calculateGrade() that calculates the grade based on the marks and returns it as a string (e.g., "A+", "B", "C", etc.).
Add a method named displayDetails() that displays the student's name, roll number, age, marks, and grade.
In the main method, create an array of Student objects to store information for multiple students. Prompt the user to input data for each student, calculate their grades, and display their details.*/
import java.util.*;
class Student
  {
    private String name;
    private int rollno,age,marks;
    public void setName(String name)
    {
     this.name=name; 
    }
    public void setRoll(int rollno)
    {
      this.rollno=rollno;
    }
    public void setAge(int age)
    {
      this.age=age;
    }
    public void setMarks(int marks)
    {
      this.marks=marks;
    }
    public String getName()
    {
      return name;
    }
    public int getRoll()
    {
      return rollno;
    }
    public int getAge()
    {
      return age;
    }
    public int getMarks()
    {
      return marks;
    }
     public void calculateGrade()
    {
      if(marks>=90)
      {
        System.out.println("the grade is A+");
      }
      else if(marks>80&&marks<90)
        {
        System.out.println("the grade is B");
        }
      else if(marks>50&&marks<80)
      {
        System.out.println("the grade is C");
      }
      else
        System.out.println("failed");
    }
    void displayDetails()
    {
    System.out.println("student's name :"+getName()+" "+ "roll number :"+getRoll()+ " "+"age :"+getAge()+" "+ "marks +"+getMarks()); 
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no of students");
      int size=sc.nextInt();
      Student st[]=new Student[size];
      for(int i=0;i<st.length;i++)
        {
          System.out.println("enter the student"+(i+1)+"details");
          st[i]=new Student();
          System.out.println("enter the student name");
          st[i].name=sc.next();
          System.out.println("enter the rollno");
          st[i].rollno=sc.nextInt();
          System.out.println("enter the age of a student");
          st[i].age=sc.nextInt();
          System.out.println("enter the marks of a student");
          st[i].marks=sc.nextInt();
          st[i].calculateGrade();
          st[i].displayDetails();
        }
    }
  }