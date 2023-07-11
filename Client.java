class P 
{ 
// super(); // By default super is here. 
   P() 
   { 
     System.out.println("P class's no-arg constructor"); 
   } 
 P(int x) 
 { 
    System.out.println("P class's one argument constructor"); 
 } 
public void show() 
{ 
   System.out.println("P class's method"); 
 } 
} 
class Q extends P 
{ 
  Q() 
  { 
   // super(); // JVM put the keyword 'super' by default at runtime. 
  } 
public void show()
{ 
  System.out.println("Q class's method"); 
 } 
} 
class R extends P 
{ 
  R() 
  { 
    // super(); // JVM put super() by default at runtime. 
    System.out.println("R class's no-arg constructor"); 
   } 
 } 
public class Client 
{ 
  public static void main(String[] args) { 
// Create an object of class R and call the method show() using reference variable obj. 
     R obj = new R(); 
     obj.show(); 
   } 
}
