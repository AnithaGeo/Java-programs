interface A 
{ 
  void msg(); // No body. 
} 

public class BB implements A 
{ 
    public void msg()// Override method declared in interface. 
    { 
      System.out.println("Rajagiri"); 
    } 

 void show()
 { 
    System.out.println("College"); 
  } 
public static void main(String[] args) 
{ 
    BB b = new BB(); 
    b.msg(); 
    b.show();  
    
    A a = new BB(); // A reference of interface is pointing to objects of class B.
    a.msg(); 
 //a.show(); // Compile-time error because a reference of interface can only 
//call methods declared in it and implemented by implementing class. 
// show() method is not part of interface. It is part of class B. 
//When this method is called, the compiler will give a compile-time error. 
//It can only be called when you create an object reference of class B. 
   }
 }