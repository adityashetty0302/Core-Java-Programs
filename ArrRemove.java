package Task2;

import java.util.Scanner;

public class ArrRemove {

	public static void main(String[] args) {
		int n,p;
		boolean sna=false;
		System.out.println("enter no. of elements");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<=n-1;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		System.out.println("enter element to be deleted");
		int d=s.nextInt();
		
		System.out.println("original array");
		for(int i=0;i<=n-1;i++)
		{
		System.out.print(a[i]+" ");
		}
		
		for (int i=0;i<=n-1;i++)
		{
			
			
			if(a[i]==d)
			{
				if((i+1)<=n-1 && a[i+1]==d)
				{
					sna=true;
				}	
				for(int j=i;j<n-1;j++)
				{
					a[j]=a[j+1];
				}
				n--;	
				
				if(sna==true)
				{
					i--;
					sna=false;
				}
			}
		}
		
		System.out.println();
		System.out.println("final array");
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
