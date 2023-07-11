class BaseClass
{    
  void features()
  {      
    System.out.println("Feature A");      
    System.out.println("Feature B");   
  } 
 } 

class DerivedClass extends BaseClass
{   
  void ownFeature()
  {         
     System.out.println("Feature C");   
  } 
} 

public class InheritanceTest 
{   
 public static void main(String[] args) 
 {            
      DerivedClass d = new DerivedClass();  //need to create only object of derived class

          
     //  d.features(); // Call Feature() method using reference variable d.            
       d.ownFeature();     
  } 
}
