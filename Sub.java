class SuperDemo 
{ 
    int x = 100; 
 } 
public class Sub extends SuperDemo 
{ 
  int x = 200; 
  void display() 
  { 

    System.out.println("Value of variable of X: " +x); 
    System.out.println("Value of variable of X: " +super.x); 
 } 
public static void main(String[] args) 
{ 
  Sub s = new Sub(); 
   s.display(); 
 } 
}
