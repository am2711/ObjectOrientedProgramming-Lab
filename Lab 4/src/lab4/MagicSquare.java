/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class MagicSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns of the matrix: ");
        int r,c,i,j;
        r=sc.nextInt();
        c=sc.nextInt();
        int flag=1;
        int a[][]=new int[r][c];
        System.out.println("Enter the matrix elements: ");
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                a[i][j]=sc.nextInt();
         
   //For diagonal elements
   int sum = 0;
   for (i= 0; i < r; i++) {
      for (j = 0; j < c; j++) {
         if (i == j)
            sum = sum + a[i][j];
      }
   }
   
   //For non-principal diagonal elements
   int sum0 = 0;
   for (i= 0; i < r; i++) {
      for (j = 0; j < c; j++) {
         if ((i+j) == (c-1))
            sum0 = sum0 + a[i][j];
      }
   if (sum == sum0)
         flag = 1;
      else {
         flag = 0;
         break;
      }
   }
 
   //For Rows
   for (i = 0; i < r; i++) {
      int sum1 = 0;
      for (j = 0; j < c; j++) {
         sum1 = sum1 + a[i][j];
      }
      if (sum == sum1)
         flag = 1;
      else {
         flag = 0;
         break;
      }
   }
 
   //For Columns
   for (i = 0; i < r; i++) {
      int sum2 = 0;
      for (j = 0; j < c; j++) {
         sum2 = sum2 + a[j][i];
      }
      if (sum == sum2)
         flag = 1;
      else {
         flag = 0;
         break;
      }
   }
   if(flag==1)
            System.out.println("Magic Square");
   else
            System.out.println("Not a Magic Square");
        // TODO code application logic here
    }
    
}
