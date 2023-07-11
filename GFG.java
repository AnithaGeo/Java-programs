// shallow cloning

import java.io.*;


class GFG {
int i = 5;

	
	public static void main(String[] args)
	{
		

		
		GFG t1 = new GFG();
		System.out.println("Value of i = "+t1.i);
		
		t1.i = 10;
		GFG t2 = t1;
		System.out.println("Value of t1.i = "+t1.i);
		System.out.println("Value of t2.i = "+t2.i);
	
		System.out.print(
				"Output: False if Deepcopy & True if shallow : ");
				System.out.println(t1 == t2);
	}
}
