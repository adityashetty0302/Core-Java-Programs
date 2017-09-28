package Hw;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int c,n,t,a;
		c=0;
		System.out.println("enter a no.");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		t=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		
		if(c==t)
		{
			System.out.println("armstrong no.");
		}
		else
		{
			System.out.println("not a armstrong no.");
		}

	}

}
