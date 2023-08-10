//Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.
class Product
  {
    String prname;
    long price,quantity;
    Product(String p,long pr,long qua)
    {
      prname=p;
      price=pr;
      quantity=qua;
    }
    public void display()
    {
      System.out.println("the product name is "+prname);
      System.out.println("the price is "+price);
      System.out.println("the quantity is "+quantity);
    }
    public static void main(String args[])
    {
      Product product=new Product("philips trimmer",1000,1);
      product.display();
    }
  }
