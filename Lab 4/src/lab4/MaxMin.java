package lab4;

import java.util.Scanner;
class MaxMin
{
      public static void main(String args[])
      { 
        Scanner sc = new Scanner(System.in);
        int max,min,n;  
        System.out.println("Enter the number of array elements");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        max = -999999;
        min = 999999;
        for (int i=0;i<n ;i++ ) {
           a[i] = sc.nextInt();
           if (a[i] > max) {
              max = a[i];            
           }
           if(a[i]<min)
               min = a[i];
        }
        System.out.println("The Largest is " + max);  
        System.out.println("The Smallest is " + min); 
      }         
}