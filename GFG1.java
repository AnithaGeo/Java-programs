// Deep Cloning


import java.io.*;


public class GFG1 implements Cloneable {
int i = 5;

public Object clone() throws CloneNotSupportedException
{
return (GFG1)super.clone();
}

	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		GFG1 t1 = new GFG1();
		System.out.println("value of int i = " + t1.i);
		
		GFG1 t2 = (GFG1)t1.clone();
		t2.i = 10;

		System.out.println("value of int t1.i = " + t1.i);
		System.out.println("value of int t2.i = " + t2.i);
		
		System.out.println(t1 == t2);
	}
}
