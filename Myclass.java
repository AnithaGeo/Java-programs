class A 
{      
  int a = 10;        
  A()
  {         
    System.out.println("Class A constructor");    
  }   

  static // Declare a static block.
  {         
    System.out.println("Class A SIB"); 
  } 
      
   {          // Declare an instance block.
     System.out.println("Class A IIB");      
   } 
  } 

class B extends A
{  
 int b = 20;
} 

public class Myclass { 
 public static void main(String[] args){ 
         
  B obj = new B();        
   System.out.println("Value of a: " +obj.a);        
   System.out.println("Value of b: " +obj.b);  
  } 
 }
