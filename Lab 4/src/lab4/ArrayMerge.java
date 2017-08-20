package lab4;


import java.util.Scanner;
class ArrayMerge
{
      public static void main(String args[])
      { 
        Scanner sc = new Scanner(System.in);
        int max,min,n;  
        System.out.println("Enter the number of array elements");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the first array elements");
        for (int i=0;i<n ;i++ ) {
           a[i] = sc.nextInt();
        }
        int m;
        System.out.println("Enter the number of array elements");
        m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter the Second array elements");
        for (int i=0;i<m ;i++ ) {
           b[i] = sc.nextInt();
        }
        int c[] = new int[m+n];
        int i;
        for(i=0;i<n;i++)
        c[i] = a[i];
        for(int j=0;j<m;j++,i++)
           c[i] = b[j];
        for(i=0;i<m+n;i++)
        {
           for(int j=0;j<m+n-i-1;j++)
           {
              if(c[j]>c[j+1])
              {
                int temp = c[j];
                c[j] = c[j+1];
                c[j+1] = temp;
              }
           
           }
        }
        System.out.println("The Sorted and Merged Array is ");
        for(i=0;i<m+n;i++)
            System.out.print(c[i]+" ");
        
      }         
}