class X 
{ 
 public void methodX() 
 { 
   System.out.println("Class X method"); 
  } 
} 
class Y extends X 
{ 
  public void methodY() 
  { 
    System.out.println("Class Y method"); 
  } 
} 
public class Z extends Y 
{ 
  public void methodZ() 
  { 
    System.out.println("Class Z method"); 
  } 
public static void main(String[] args) 
{ 
   Z z = new Z(); 
    z.methodX(); // Calling X grand class method. 
    z.methodY(); // Calling Y parent class method. 
    z.methodZ(); // Calling Z class local method. 
  } 
}
