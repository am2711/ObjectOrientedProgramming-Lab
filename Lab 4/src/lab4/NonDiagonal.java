package lab4;

import java.util.Scanner;

class NonDiagonal{
     public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no: of rows and columns of the matrix");
	int r,c,sum=0;
	r = sc.nextInt();
	c = sc.nextInt();
	int a[][] = new int[r][c];
	System.out.println("Enter the Matrix Elements");
	for(int i=0 ; i<r ;i++)
		for(int j=0 ; j<c ;j++)
			a[i][j] = sc.nextInt();
	System.out.println("The Non Diagonal Elements are ");
	for(int i=0 ; i<r ; i++)
	{
            for(int j=0 ; j<c ; j++)
	   {
		    if((i+j)==(c-1))
		    {
			    sum += a[i][j];
			    System.out.print(a[i][j]+" ");
		    }
	    }
	    System.out.println("");
         }
         System.out.println("The sum of The Non Diagonal Elements is "+sum);

     }
}     
