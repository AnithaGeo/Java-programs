public class InsertDemo {
public static void main(String[] args)
{
   StringBuilder sb = new StringBuilder(50);
   StringBuilder sb1 = sb.append("God Loves me ");
   StringBuilder sb2 = sb1.insert(10, "you and ");
   StringBuilder sb3 = sb2.insert(21, "abundantly");
   System.out.println(sb3);
   System.out.println();
   
   StringBuilder sb4 = new StringBuilder("Aathira got a");
   System.out.println("Original Statement: " +sb4);
   StringBuilder sb5 = sb4.replace(12, 13, "A+");
   System.out.println("New Statement: " +sb5);
   
  }
}