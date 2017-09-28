
package matrixmul;

import java.util.Scanner;


public class MatrixMul 
{

    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter array 1 data");
        int a1[][] = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a1[i][j]=s.nextInt();
            }
                
        }
        
        System.out.println("");
        System.out.println("enter array 2 data");
        
        int a2[][] = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a2[i][j]=s.nextInt();
            }
                
        }
        System.out.println("");
        System.out.println("array 3");
        int a3[][] = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a3[i][j]=a1[i][j]*a2[i][j];
                System.out.print(a3[i][j]+"\t");
            }
            
            System.out.println("");
                
        }
        
            
    }
    
}
