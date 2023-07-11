public class CapacityTest2 { 
public static void main(String[ ] args) 
{ 
 StringBuffer sb = new StringBuffer("Rajagiri"); 
  int length = sb.length(); 
  int capacity = sb.length() + 16; 
  
  System.out.println(length); 
  System.out.println(capacity); 
  } 
}