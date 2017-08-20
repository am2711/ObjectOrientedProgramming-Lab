package lab4;

import java.util.Scanner;

class PrinceDiag{
	public static void main(String args[])
              {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the No. of Rows and Columns of the matrix: ");
		      int r,c,sum=0;
		      r = sc.nextInt();
		      c = sc.nextInt();
		      int a[][] = new int[r][c];
		      System.out.println("Enter the matrix Elements: ");
		      for(int i=0 ; i<r ;i++)
			      for(int j=0; j<c ;j++)
				      a[i][j] = sc.nextInt();
		      System.out.println("The Principal Diagonal elements are: ");
		    
		      for(int i=0 ; i<r ; i++)
		      {
			      for(int j=0 ; j<c ;j++)
			      {
				      if(i==j)
				      {
					      sum += a[i][j];
					      System.out.println(a[i][j]+" ");
				      }
			      }
		      }
		System.out.println("The sum of Principal Diagonal elements is "+sum);
	      }
}	
