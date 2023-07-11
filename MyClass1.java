class Marry 
{ 
  void engagementDate() 
  { 
    System.out.println("Engagement will be done on 23 Dec."); 
  } 

   void marryDate() // Overridden method. 
   { 
      System.out.println("Marry will be on 25 Dec"); 
   } 
}
class Change extends Marry 
{ 

   void marrydate()  // Overriding method. 
   { 
     System.out.println("Marry will be on 27 Dec"); 
    } 
 } 
public class MyClass1
{ 
  public static void main(String[] args) 
  { 
     Change obj = new Change(); 
      obj.engagementDate(); 
      obj.marrydate(); 
   } 
 }
