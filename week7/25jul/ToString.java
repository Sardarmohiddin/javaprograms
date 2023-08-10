class ToString
  {
    String employ,designation;
    int salary;
    public String toString()
    {
      return employ+"\n"+designation+"\n"+salary;
    }
    public static void main(String args[])
    {
      ToString t=new ToString();
      t.employ="sardar";
      t.designation="java developer";
      t.salary=10000;
      System.out.println(t);
    }
  }