/*Assignment 4: Hybrid Inheritance
Create a superclass called "Person" with the following attributes:
String nameint agedouble salaryString majordouble gpaString company*/
class Person
  {
    String name="sardar";
    int age=23;
  }
class Person1 extends Person{
  double salary=10000;
 
}
class Person2  extends Person1{
  String company="bitlabs";
}
class Person3 extends Person2{
   String major="full stack developer";
}
class Person4 extends Person{
  double gpa=9.7;
}
class Hybrid
  {
    public static void main(String args[])
    {
      Person3 p3=new Person3();
      Person4 p4=new Person4();
     System.out.println(p3.name+" "+p3.company+" "+p3.age+" "+p3.salary); 
      System.out.println(p4.name+" "+p4.age+" "+p4.gpa);
    }
  }