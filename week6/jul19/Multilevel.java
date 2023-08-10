//example for multilevel inheritance
class Fruit
  {
    void eat()
    {
      System.out.println("the fruit gives energy");
    }
  }
class Taste extends Fruit
  {
    void sweet()
    {
      System.out.println("mango fruit is sweet");
    }
  }
class Colour extends Taste{
  void colourof()
  {
    System.out.println("the colour of the friut is yellow");
  }
}
class Multilevel
  {
    public static void main(String args[])
    {
      Colour colour=new Colour();
      colour.eat();
      colour.sweet();
      colour.colourof();
    }
  }
