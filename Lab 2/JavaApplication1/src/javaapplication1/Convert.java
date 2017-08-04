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
public class Convert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double d=sc.nextDouble();
        char ch=sc.next().charAt(0);
        
        byte b=(byte)a;
        int c=ch;
        byte dou=(byte)d;
        int d1=(int)d;
        System.out.println(""+b+" "+c+" "+dou+" "+d1);
        // TODO code application logic here
    }
    
}
