package lab4;

import java.util.Scanner;

class ArrayMulti{
	public static void main(String args[])
              {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the No of Rows and Colums of the first matrix");
		      int r,c,sum=0;
		      r = sc.nextInt();
		      c = sc.nextInt();
		      int a[][] = new int[r][c];
		      System.out.println("Enter the matrix Elements");
		      for(int i=0 ; i<r ;i++)
			      for(int j=0; j<c ;j++)
				      a[i][j] = sc.nextInt();
		    System.out.println("Enter the No of Rows and Colums of the Second matrix");
                    int ch,r2,c2;
                    r2 = sc.nextInt();
		    c2 = sc.nextInt();
		    int b[][] = new int[r2][c2];
                    System.out.println("Enter the Second matrix Elements");
		      for(int i=0 ; i<r ;i++)
			      for(int j=0; j<c ;j++)
				      b[i][j] = sc.nextInt();
                    System.out.println("Do you want to add or multiply these two matrices ");
                    System.out.print("1. for add 2. for multiply");
                    ch = sc.nextInt();
                    switch(ch)
                    {
                      case 1:
                      if(r==r2 && c == c2)
                      {     
                      int add[][] = new int[r][c];
		      for(int i=0 ; i<r ; i++)
		      {
			      for(int j=0 ; j<c ;j++)
			      {
				      add[i][j] = a[i][j] + b[i][j];
			      }
		      }
                      System.out.println("The matrix after Addition is :");
                       for(int i=0 ; i<r ; i++)
		       {
			      for(int j=0 ; j<c ;j++)
			      {
				     System.out.print(add[i][j]+" ");
			      }
                              System.out.println("");
		       } 
                      }
                      else 
                      {  System.out.println("Cannot be added");
                          System.exit(1);
                      }
                      break;
                      case 2:
                          if(c == r2)
                          {
                          int d[][] = new int[r][c2];
                          for(int i=0 ; i<r ;i++)
                          {
                           for(int j=0; j<c2 ;j++)
                           {
                              d[i][j] = 0;    
                           }
                          }
                          for(int i=0 ; i<r ;i++)
                          {
                           for(int j=0; j<c2 ;j++)
                           {
                             for(int k=0 ; k<c ;k++)
                                 d[i][j] += a[i][k] * b[k][j];
                           }
                          }
                          for(int i=0 ; i<r ;i++)
                          {
                           for(int j=0; j<c2 ;j++)
                           {
                              System.out.print(d[i][j]+" ");    
                           }
                           System.out.println("");
                          }
                          
                         }
                          else
                          {
                              System.out.println("Error Cannot mbe multiplied");
                              System.exit(1);
                          }
                          break;
                    }
	      }
}	
