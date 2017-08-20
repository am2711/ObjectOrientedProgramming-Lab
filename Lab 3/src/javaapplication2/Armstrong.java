/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
        while(temp>0)
        {
            sum+=(temp%10)*(temp%10)*(temp%10);
            temp/=10;
        }
        if(sum==a)
            System.out.println("It is an Armstrong Number");
        else
            System.out.println("It's not an Armstrong Number");
        // TODO code application logic here
    }
    
}
