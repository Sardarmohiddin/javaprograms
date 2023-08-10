/* Assignment 3: Animal Hierarchy
 
Create an abstract class called "Animal" with the following abstract methods:
 
speak(): Outputs the sound that the animal makes.
move(): Describes how the animal moves.
 
Create concrete classes Dog, Cat, and Bird that inherit from the abstract class "Animal." Implement the required methods for each class.
 
Write a program to:
 
Create instances of Dog, Cat, and Bird.
Display the sound and movement of each animal.*/

abstract class Animal
  {
    abstract void speak();
    abstract void move();
  }
class Dog extends Animal
  {
    public void speak()
    {
      System.out.println("Dong Sounds as Bow Bow");
    }
    public void move()
    {
      System.out.println("Dog is walking");
    }
  }
class Cat extends Animal
  {
    public void speak()
    {
      System.out.println("Cat Sounds as Meow Meow");
    }
    public void move()
    {
      System.out.println("Cat is walking");
    }
  }
class Bird extends Animal
  {
    public void speak()
    {
      System.out.println("Birds Can Speak");
    }
    public void move()
    {
      System.out.println("Bird is moved by Flying");
    }
  }
class Problem3
  {
    public static void main(String[]args)
    {
      Animal d=new Dog();
      Animal c=new Cat();
      Animal b=new Bird();
      d.speak();
      d.move();
      c.speak();
      c.move();
      b.speak();
      b.move();
    }
  }