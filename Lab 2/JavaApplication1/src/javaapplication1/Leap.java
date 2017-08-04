/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Leap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a year");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%4!=0)
        System.out.println("Common Year");
        else if(a%100!=0)
        System.out.println("Leap Year");
        else if(a%400!=0)
        System.out.println("Common Year");
        else
        System.out.println("Leap Year");// TODO code application logic here
    }
    
}
