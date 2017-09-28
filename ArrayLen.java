package Hw;

public class ArrayLen {

	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5};
		int[] b={1,2,3,4,5,6,7,8};
		
		if(a.length>b.length)
		{
			for(int i=0;i<=a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		
		else
		{
			for(int i=0;i<=b.length-1;i++)
			{
				System.out.println(b[i]);
			}
		}

	}

}
