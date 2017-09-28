package Hw;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter f no.");
		a=s.nextInt();
		System.out.println("enter s no.");
		b=s.nextInt();
		
		System.out.println("menu");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("enter your choice");
		c=s.nextInt();
		
		switch(c)
		{
		case 1:
			System.out.println(a+b);
			break;
		
		case 2:
			System.out.println(a-b);
			break;
			
		case 3:
			System.out.println(a*b);
			break;
			
		case 4:
			System.out.println(a/b);
			break;	
			
		default:
			System.out.println("wrong input");
		}
		
		
		

	}

}
