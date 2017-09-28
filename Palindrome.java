package Hw;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String o,r="";
		Scanner s = new Scanner (System.in);
		System.out.println("enter input ");
		o=s.next();
		
//		int l=o.length();
//		for(int i=l-1;i>=0;i--)
		
		for(int i=o.length()-1;i>=0;i--) 
		{
			r=r+o.charAt(i);
			
		}
		
//		System.out.println(r);
		
		if(o.equals(r))
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println(" not palindrome");
			
		}
	}

}
