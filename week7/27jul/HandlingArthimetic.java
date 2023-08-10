public class HandlingArthimetic {  
  
    public static void main(String[] args) {  
        try  
        {  
        int a=50/0;  
        System.out.println("rest of the code");  
        }    
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
      System.out.println("using the arthimetic exception");
          
    }  
      
}  