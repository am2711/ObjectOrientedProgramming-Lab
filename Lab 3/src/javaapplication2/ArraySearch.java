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
public class ArraySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the element to be searched for: ");
        int k=sc.nextInt();
        System.out.print("Element found at position: ");
        int index=0;
        int flag=0;
        for(int i:a)
        {
            if(i==k)
            {
                System.out.print("a["+index+"]"+" ");
                flag++;
            }
            
            index++;
        }
        if(flag==0)
                System.out.println("Null");
        // TODO code application logic here
    }
    
}
