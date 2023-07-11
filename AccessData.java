import java.util.Scanner;
class Student {
   private String name;
   private int age;
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void display() {
      System.out.println("name: "+getName());
      System.out.println("age: "+getAge());
   }
}
public class AccessData{
   public static void main(String args[]) {
      //Reading values from user
      Scanner sc = new Scanner(System.in);
   System.out.println("Enter the name of the student: ");
   String name = sc.nextLine();
   System.out.println("Enter the age of the student: ");
   int age = sc.nextInt();
   //Calling the setter and getter methods
   Student obj = new Student();
   obj.setName(name);
   obj.setAge(age);
   obj.display();
   }
}