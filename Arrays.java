import java.util.Scanner;
class Arrays
{

public static void main(String args[])
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Size of the array");
int n=scn.nextInt();
int a[] = new int[n];
for(int i=0; i<n; i++)
{
System.out.println("Enter the Number:");
	a[i] = scn.nextInt();
}
for(int i=0; i<n; i++)
{
System.out.println("Number:"+a[i]);
	
}
// for two dimensional array
//syntax: int[][] studentmarks = new int[row][col];
//plz note that to create an array in java the keyword 'new' to be used 

}
}


