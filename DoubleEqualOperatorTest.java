public class DoubleEqualOperatorTest { 
public static void main(String args[])
{ 
  String s1 = new String("Football"); 
  String s2 = new String("Football"); 
 
  String s3 = "Football"; 
  String s4 = "Football"; 

  System.out.println(s1==s2); // false 
  System.out.println(s1==s3); // false 

 System.out.println(s1==s4); // false 
 System.out.println(s3==s4); // true 
 } 
}