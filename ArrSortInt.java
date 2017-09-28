package Task2;

import java.util.Scanner;

public class ArrSortInt {

	public static void main(String[] args) {
		int n,b=0;
		System.out.println("enter no. of elements");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<=n-1;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])     /*for ascending*/
//				if(a[i]<a[j])	  /*for descending*/
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
					
				}
			}
		}
		
		for(int i:a)
		{
			System.out.println(i);
		}

	}

}
