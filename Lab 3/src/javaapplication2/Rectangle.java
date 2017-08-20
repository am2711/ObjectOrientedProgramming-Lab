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
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int len, breadth;
        System.out.println("Input Length and Breadth");
        Scanner sc=new Scanner(System.in);
		len=sc.nextInt();			//Input Length
		breadth=sc.nextInt();		//Input Breadth
		int area=len*breadth;			//Calculating area
		int peri=2*(len+breadth);			//Calculating perimeter
		System.out.println("Area is "+area);		//Printing Result
		System.out.println("Perimeter is "+peri);		//Printing Result
        // TODO code application logic here
    }
    
}
