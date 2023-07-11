class A 
{      
     int a = 10;      
     static int b = 30;    
     static void show()  
     {   
       System.out.println("Static method of class A");  
     }   
    void display() 
    {   
       System.out.println("Non-static method of class A");  
    } 
  } 
 public class Binher extends A 
 {   
   static int a = 20;      
    int b = 40;    
  void show()    
  {       
     System.out.println("Non-static method of class B");   
  }    
 static void display()   
  {    
     System.out.println("Static method of class Binher");    
  } 
public static void main(String[] args)  
{     
      Binher obj = new Binher();    
      System.out.println("Value of a: " +Binher.a);     
      System.out.println("Value of b: " +obj.b);     
      obj.show();    
      Binher.display();   
  } 
}
