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
public class CountMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns of the matrix: ");
        int r,c,i,j,k;
        double norm=0;
        r=sc.nextInt();
        c=sc.nextInt();
        double a[][]=new double[r][c];
        System.out.println("Enter the matrix elements: ");
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                a[i][j]=sc.nextDouble();
        System.out.println("Enter a number to count: ");
        k=sc.nextInt();
        int count=0;
    for(i=0 ; i<r ; i++)
		      {
			      for(j=0 ; j<c ;j++)
			      {
				      if(a[i][j]==k)
                                      {
                                          count++;
                                      } else {
				      }
			      }
		      }
        if(count==0)
            System.out.println("The element was not found");
        else
        System.out.println("The given number was found in the matrix "+count+" times");
        // TODO code application logic here
    }
    
}
