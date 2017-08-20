/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author student
 */
public class TraceNorm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns of the matrix: ");
        int r,c,i,j,trace=0;
        double norm=0;
        r=sc.nextInt();
        c=sc.nextInt();
        double a[][]=new double[r][c];
        System.out.println("Enter the matrix elements: ");
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                a[i][j]=sc.nextDouble();
    for(i=0 ; i<r ; i++)
		      {
			      for(j=0 ; j<c ;j++)
			      {
				      if(i==j)
				      {
					      trace += a[i][j];
				      }
			      }
		      }
		System.out.println("The trace of the matrix is "+trace);
                
    for(i=0 ; i<r ; i++)
		      {
			      for(j=0 ; j<c ;j++)
			      {
				      norm+=((a[i][j])*(a[i][j]));
			      }
		      }
        System.out.println("Norm of the matrix is "+Math.sqrt(norm));
	      }       
        // TODO code application logic here
    }
    
