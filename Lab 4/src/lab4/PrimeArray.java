package lab4;

import java.util.Scanner;

class PrimeArray{

      public static int IsPrime(int a)
          {
             if(a<2)
                 return 0;
             for(int i=2;i<=Math.sqrt(a);i++)
             {
                  if(a%i==0)
                      return 0;
             }
             return 1;
          }
          public static void main(String args[])
          {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter The Number of elements in the Array");
              int n;
              n = sc.nextInt();
              int a[] =new int[n];
              System.out.println("Enter the array elements");
              for(int i=0;i<n;i++)
                  a[i] = sc.nextInt();
              for(int i=0;i<n;i++)
              {
                if(IsPrime(a[i])==1)
                   System.out.print(a[i]+" ");
              }
          
         }
}