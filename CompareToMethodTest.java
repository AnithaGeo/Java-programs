public class CompareToMethodTest 
{ 
public static void main(String args[])
{ 
 String s1 = "rajagiri"; 
 String s2 = "rajagiri"; 
 String s3 = "college"; 
 String s4 = "social"; 
 String s5 = " "; // Empty string. 

System.out.println(s1.compareTo(s2)); // 0 because both are equal. 
System.out.println(s1.compareTo(s3)); // 15 because 'r' is 15 times greate than 'c'. 
System.out.println(s1.compareTo(s4)); // -1 because 'r' is 1 time lower than 's'. 

System.out.println(s3.compareTo(s4)); // -16 
System.out.println(s4.compareTo(s5)); // 83 why? explore
 } 
}