class Parent
  {
    public void height()
    {
      System.out.println("all are above 5 feet");
    }
    public void lastname()
    {
      System.out.println("last name is shaik");
    }
  }
class Sardar extends Parent
  {
   public void  innocence()
    {
      System.out.println("sardar is innocent");
    }
    public static void main(String args[])
    {
     Sardar sardar=new Sardar();
      sardar.lastname();
      sardar.innocence();
      sardar.height();
    }
  }
