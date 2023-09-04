
class Pattern
  {
    public static void main(String args[])
    {
      int n=4;
  // this for loop is used for rows
     for(int i=0;i<n;i++)
       //here i=o;0<4;
        {
          // this for loop is used for columns
          for(int j=0;j<n;j++)
            //here j=0;0<4;
            {
              //1st row,4th row,1st col,last col should print with *
              if(i==0||j==0||i==n-1||j==n-1)
                //i==0;j==0;i==3;j==3
                
              {
                System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
            }
          System.out.println();
        }
        
    }
  }