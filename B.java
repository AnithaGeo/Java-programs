class A 
{ 
   B obj; 
   A(B obj)  
   { 
     this.obj = obj; 
   } 

void show() 
{ 
  System.out.println("Show method is called"); 
  System.out.println("Value of b: " +obj.b); 
 } 
} 

class B 
{ 

    int b = 30; 
    B() 
    { 
 
      A a = new A(this);  
      a.show(); 
    } 
public static void main(String[] args) 
 { 
     B obj = new B(); 
   } 
 }
