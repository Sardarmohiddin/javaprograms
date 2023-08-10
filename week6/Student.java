//Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object.
class Student {
  String stdname;
  int roll;
  char grade;

  Student(String n, int r, char g) {
    stdname = n;
    roll = r;
    grade = g;
    System.out.println(
        "student name is " + stdname + " " + "roll number is " + roll + " " + "the grade of a student is " + grade);
  }

  public static void main(String args[]) {
    Student student = new Student("sardar", 10, 'A');
  }
}