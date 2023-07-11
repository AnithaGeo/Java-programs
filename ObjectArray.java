public class ObjectArray 
{ 
  ObjectArray()
  { 
     System.out.println("Hello Java"); 
  } 
public static void main(String[] args) 
{ 
 // Create an array object. 
      ObjectArray[] a = new ObjectArray[4]; //the default constructor is not invoked here
      for(int i=0; i < a.length; i++ )
      { 
        a[i] = new ObjectArray(); // Default constructor is called & executed here only
      } 
    } 
 }
