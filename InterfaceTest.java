//Polymorphism in Interface
//two or more classes implement the same interface with different implementations then through the object of each class, - polymorphism

interface Area 
{ 
  float pi = 3.14f; // Constant declaration. 
  float calculateArea(float x, float y); 
 } 

class Circle implements Area 
{ 
  public float calculateArea(float x, float y)
  { 
    float areaOfCircle = pi * x * y; // Implementation. 
    return areaOfCircle; 
  } 
} 

class Square implements Area 
{ 
  public float calculateArea(float x, float y)
  { 
    float areaOfSquare = x * y; // Implementation. 
     return areaOfSquare; 
  } 
} 

public class InterfaceTest 
{ 
  public static void main(String[] args) 
  { 
    Area a; // Creating interface reference. 
    a = new Circle(); // Creating object of circle. 
    float circle = a.calculateArea(20, 10.5f); 
    System.out.println("Area of circle: " +circle); 
      
    a = new Square(); // Creating object of square. 
    float square = a.calculateArea(20.5f, 10.5f); 
    System.out.println("Area of square: " +square); 
  } 
}