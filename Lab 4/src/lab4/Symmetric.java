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
public class Symmetric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns of the matrix: ");
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        int flag=1;
        int a[][]=new int[r][c];
        System.out.println("Enter the matrix elements: ");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=sc.nextInt();
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
            if(a[i][j]!=a[j][i])
                flag=0;
            }
        if(flag==1)
            System.out.println("The matrix is Symmetric");
        else
            System.out.println("The matrix is Non Symmetric");
        // TODO code application logic here
    }
    
}
