package Task2;

import java.util.Scanner;

public class ArrSum {

	public static void main(String[] args) {
		int n;
		System.out.println("enter no. of elements");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<=n-1;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		int sum=0;
		for(int i=0;i<=n-1;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);

	}

}
