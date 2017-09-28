
package arraydemo3;

import java.util.Scanner;


public class ArrayDemo3 
{

    
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a no.");
        n = s.nextInt();
        
        int a[] = new int [n];
        System.out.println("enter more " +n+ " no.s");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
         
        }
        
        for(int m=0;m<n;m++)
        {
            
        for(int j=1;j<=a[m];j++)
            {
                if(j%3==0 && j%5==0)
                System.out.println("fizzbuzz");
                else if(j%3==0)
                    System.out.println("fizz");
                else if(j%5==0)
                    System.out.println("buzz");
                else
                    System.out.println(j);
                      
            }
        }
        
        
    }
    
}
