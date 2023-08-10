class Sardar
  {
    int roll;
    String place;
    public void insert(int r,String p)
      {
      roll=r;
        place=p;
      }
    public void display()
    {
      System.out.println(roll);
      System.out.println(place);
      
    }
    public static void main(String args[])
    {
      Sardar s=new Sardar();
      s.insert(20,"vijayawada");
      s.display();
    }
    
  }