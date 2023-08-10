interface Sardar
  {
    void Study();
    void Sleep();
  }
interface Ram
  {
    void Study();
    void Sleep();
  }
class Sardar1 implements Sardar,Ram{
 public void Study()
  {
    System.out.println("reads daily 2 hours");
  }
  public void Sleep()
  {
    System.out.println("sleeps dauly foe 8 hrs");
  }
}
class MulInherit
  {
    public static void main(String args[])
    {
      Sardar s=new Sardar1();
      Ram r=new Sardar1();
      s.Study();
      s.Sleep();
      r.Study();
      r.Sleep();
    }
  }