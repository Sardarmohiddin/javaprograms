import java.util.Scanner;
class RockPaperScissor
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter user option");
      char user=sc.next().charAt(0);
      System.out.println("Enter computer option");
      char comp=sc.next().charAt(0);
      if(((user=='r')&&(comp=='p'))||((user=='R')&&(comp=='P')))
      {
       System.out.println("Computer won the game");
      }
      else if(((user=='p')&&(comp=='r'))||((user=='P')&&(comp=='R')))
      {
       System.out.println("User won the game");
      }
      else if(((user=='p')&&(comp=='s'))||((user=='P')&&(comp=='S')))
      {
      System.out.println("Computer won the game");
      }
      else if(((user=='s')&&(comp=='p'))||((user=='S')&&(comp=='P')))
      {
      System.out.println("User won the game");
      }
      else if(((user=='r')&&(comp=='s'))||((user=='R')&&(comp=='S')))
      {
      System.out.println("User won the game");
      }
      else if(((user=='s')&&(comp=='r'))||((user=='S')&&(comp=='R')))
      {
      System.out.println("Computer won the game");
      }
     else
      {
        System.out.println("enter the valid input");
      }
    }
  }