package Hw;

import java.util.Scanner;

public class ArrRevStrSwap {

	public static void main(String[] args) {
		int n;
		String t;
		System.out.println("enter no. of elements in a string");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		String a[]=new String[n];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<=n-1;i++)
		{
			a[i]=s.next();
			
		}
		
		for(int i=0;i<=n-1;i++)
		{
			t=a[i];
			a[i]=a[n-1];
			a[n-1]=t;
			n--;
		}
	
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
//		for(String i:a)
//		{
//		System.out.println(i);
//		}
	}
		

}