/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author student
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two limits: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int flag;
        System.out.println("The prime numbers are: ");
        for(int i=a;i<=b;i++)
        {
            flag=1;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if((i%j)==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                System.out.print(i+" ");
        }
        // TODO code application logic here
    }
    
}
