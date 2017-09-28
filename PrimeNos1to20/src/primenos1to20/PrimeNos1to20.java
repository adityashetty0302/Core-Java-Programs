package primenos1to20;

public class PrimeNos1to20 
{
    public static void main(String[] args) 
    {
       int m, k, i, flag;
      
       for (k=2;k<=20;k++)
       {
           m=k/2;
           flag=0;
           for (i=2;i<=m;i++)
           {
               if (k%i==0)
               {
                   flag=1;
                  
               }
           }
           if (flag==0)
           {
               System.out.println(k);
           }
       }
    }
}
