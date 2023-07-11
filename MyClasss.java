class A 
{ 
 public void msgA() 
 { 
   System.out.println("Method of class A"); 
 } 
} 
class B extends A 
{ 
   // Empty class B, inherits msgA of parent class A.
 
} 
class C extends A 
{ 
 // Empty class C, inherits msgA of parent class A. 

 } 
class D extends A 
{ 
  // Empty class D, inherits msgA of parent class A. 

 } 
public class MyClasss 
{ 
  public static void main(String[] args) 
  { 
// Create the object of class B, class C, and class D. 
    B obj1 = new B(); 
    C obj2 = new C(); 
    D obj3 = new D(); 

// Calling inherited function from the base class. 
    obj1.msgA(); 
    obj2.msgA(); 
    obj3.msgA(); 
  } 
 }
