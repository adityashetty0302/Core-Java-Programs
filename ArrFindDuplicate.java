package Task2;

import java.util.Scanner;

public class ArrFindDuplicate {

	public static void main(String[] args) {
		
		int n;
		System.out.println("enter no. of elements");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		System.out.println("Duplicate values are ");
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" "+a[j]+" ");
				}
			}
		}

	}

}
