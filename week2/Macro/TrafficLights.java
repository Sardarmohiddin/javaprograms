
/*Traffic Light Simulator: Create a simulation of traffic lights at a junction. Use conditional statements to change the lights based on the time of day and the traffic flow.*/
import java.util.Scanner;
class TrafficLights
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter either AM or PM");
      String ch=sc.next();
      System.out.println("Enter the time");
      int time=sc.nextInt();
      if(ch=="AM"||ch=="am")
      {
        if((time>=8)&&(time<=10))
           {
          System.out.println("Red");
           }
       else if((time>10)&&(time<=12))
        {
          System.out.println("Orange");
        }
        else
        {
        System.out.println("Green");  
        }
      }
      else 
      {
        if((time>=5)&&(time<=8))
        {
          System.out.println("Red");
        }
     else if((time>8)&&(time<=10))
        {
          System.out.println("Orange");
        }
        else
        {
          System.out.println("Green");
        }
      }
    }
    }
     