package c2e15;

import java.util.Scanner;

public class C2E15 
{
    public static void main(String[] args) 
    {
        int i,k;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no. of employees: ");
        i=s.nextInt();
        int [][] num = new int[i][3];
        String [][] words = new String[i][4];
        
        
        
        for (k=0;k<i;k++)
        {
            System.out.println("enter id of "+(k+1));
            num[k][0]=s.nextInt();
            System.out.println("enter name:of "+(k+1));
            words[k][0]=s.next();
            System.out.println("enter dept of "+(k+1));
            words[k][1]=s.next();
            System.out.println("enter des of "+(k+1));
            words[k][2]=s.next();
            System.out.println("enter doj: "+(k+1));
            num[k][1]=s.nextInt();
            System.out.println("enter dob: "+(k+1));
            num[k][2]=s.nextInt();
            System.out.println("enter ms: "+(k+1));
            words[k][3]=s.next();
            
            
        }
        
        for (k=0;k<=i;k++)
        {
            System.out.println("id of "+(k+1)+" is "+num[k][0]);
            System.out.println("name of "+(k+1)+" is "+words[k][0]);
            System.out.println("dept of "+(k+1)+" is "+words[k][1]);
            System.out.println("des of "+(k+1)+" is "+words[k][2]);
            System.out.println("doj of "+(k+1)+" is "+num[k][1]);
            System.out.println("dob of "+(k+1)+" is "+num[k][2]);
            System.out.println("ms of "+(k+1)+" is "+words[k][3]);
        }
            
            
        
    }
}
