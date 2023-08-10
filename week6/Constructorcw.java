//Initializing the object through constructor
class Student
  {
    String studentName;
    int studentRollno;
    Student(String name,int rollno)
    {
      studentName=name;
      studentRollno=rollno;
    }
    public void display()
    {
     System.out.println(studentName+" "+studentRollno);
    }
    public static void main(String args[])
    {
      Student student=new Student("james",123);
      student.display();
    }
  }


