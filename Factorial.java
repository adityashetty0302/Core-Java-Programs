package Hw;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int a,n;
		System.out.println("enter no.");
		Scanner s = new Scanner (System.in);
		n=s.nextInt();
		a=1;
		for(int i=1;i<=n;i++)
		{
			a=a*i;
			
		}
		System.out.println(a);
		

	}

}
