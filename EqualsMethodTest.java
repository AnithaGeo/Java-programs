public class EqualsMethodTest { 
public static void main(String args[])
{ 
 String s1 = "Rajagiri"; 
 String s2 = "Rajagiri"; 
 
 String s3 = new String("Rajagiri"); 
 String s4 = new String("College"); 

System.out.println(s1.equals(s2));  
System.out.println(s1.equals(s4)); 

String s5 = "Rajagiri"; 
String s6 = new String("RAJAGIRI"); 

System.out.println(s1.equals(s6)); 
System.out.println(s1.equalsIgnoreCase(s6)); 

if (s2.equals(s6)) 
{ 
    System.out.println("Both strings are equal"); 
 } 
 else { 
    System.out.println("Both strings are unequal"); 
 } 
}
}