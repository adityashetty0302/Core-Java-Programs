package Task2;

import java.util.Scanner;

public class ArrRevIntSwap {

	public static void main(String[] args) {
		int n,t=0;
		System.out.println("enter no. of elements");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<=n-1;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		for(int i=0;i<=n-1;i++)
		{
			t=a[i];
			a[i]=a[n-1];
			a[n-1]=t;
			n--;
		}
	
		for(int i:a)
		{
		System.out.println(i);
		}
	}
		

}
