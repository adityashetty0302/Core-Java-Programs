package Hw;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		
		System.out.println("enter no. of elements in a array");
		Scanner s = new Scanner (System.in);
		int n;
		n=s.nextInt();
		int[] a =new int[n];
		
		System.out.println("Enter elements of a");
		for(int i=0;i<=n-1;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		System.out.println("");
		System.out.println("a");
		for(int i=0;i<=n-1;i++)
			
		{
			
			System.out.println(a[i]);
			
		}
		
		int[] b=new int[n];
		for(int i=0;i<=n-1;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println("");
		System.out.println("b");
		for(int i=0;i<=n-1;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
	}

}
