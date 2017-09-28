package PrimeNum;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) 
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a no.");
		n=s.nextInt();
		int k=n/2;
		int flag=0;
		
			for(int i=2;i<=k;i++)
			{
				if(n%i==0)
				{
					System.out.println("not a prime no. ");		
					flag=1;
					break;
				}
			}
		
		if(flag==0)
		{
			System.out.println("prime no.");
		}
		}

}
