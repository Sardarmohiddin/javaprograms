class Student{
  String name="sardar";
  int age=23;
  void display()
  {
  System.out.println(age+name);
}
}
class Student1 extends Student{
  int sage=20;
  String sname="yasin";
  void display()
  {
    System.out.println(sage+sname);
    super.display();
  }
}
class Bitlabs
  {
    public static void main(String args[])
    {
      Student1 s1=new Student1();
      s1.display();
    }
  }