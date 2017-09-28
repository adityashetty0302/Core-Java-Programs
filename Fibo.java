package Hw;

public class Fibo {

	public static void main(String[] args) {
		
		int a,b;
		a=0;
		b=1;
		System.out.print(a+"\t");
		
		while(b<200)
		{
			System.out.print(b+"\t");
			b=b+a;
			a=b-a;
			
		}

	}

}
