package multidimensionarraydemo;

import java.util.Scanner;

public class MultiDimensionArrayDemo 
{
    public static void main(String[] args) 
    {
        double[][] multi = new double[3][2];
        Scanner s = new Scanner(System.in);
    
        for(int i=0;i<=2;i++)
        {
            System.out.println("enter height "+(i+1));
            multi[i][0] = s.nextDouble();
            System.out.println("enter weight "+(i+1));
            multi[i][1] = s.nextDouble();
        }
    
//        for(int i=0;i<=2;i++)
//        {
//            System.out.println("height of "+(i+1)+" is "+multi[i][0]);
//            System.out.println("weight of "+(i+1)+" is "+multi[i][1]);
//        
//        }
        
        for(double[] n:multi)
        {
            for(double i:n)
            {
                System.out.println(i);
            }
        }
    }
}
