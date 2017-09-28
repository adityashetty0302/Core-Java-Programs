package Task2;

import java.util.*;
//import java.util.Collections;
//import java.util.Scanner;

public class ArrSortStr {

	public static void main(String[] args) {
		
		/* method 1 */
		
		System.out.println("enter no. of elements in string array");
		Scanner s = new Scanner (System.in);
		int n,i;
		n=s.nextInt();
		String[] a=new String[n];
		
		System.out.println("enter string value");
		
		for(i=0;i<=n-1;i++)
		{
			a[i]=s.next();
		}
		
		Arrays.sort(a);									/*asc order*/
//		Arrays.sort(a,Collections.reverseOrder());		/*des order*/
		
		
		for(i=0;i<=n-1;i++)
		{
			System.out.println(a[i]);
		}

		
		
//		/* method 2 */
//		
//		int n;
//		String b="";
//		System.out.println("enter no. of elements in a string array");
//		Scanner s=new Scanner(System.in);
//		n=s.nextInt();
//		String a[]=new String[n];
//		
//		System.out.println("Enter elements");
//		
//		for(int i=0;i<=n-1;i++)
//		{
//			a[i]=s.next();
//			
//		}
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			for(int j=i+1;j<=a.length-1;j++)
//			{
//				if(a[i].compareTo(a[j])>0)     /*for ascending*/
//				if(a[j].compareTo(a[i])>0)	  /*for descending*/
//				{
//					b=a[i];
//					a[i]=a[j];
//					a[j]=b;
//					
//				}
//			}
//		}
//		
//		for(String i:a)
//		{
//			System.out.println(i);
//		}
//
//		
	}

}
