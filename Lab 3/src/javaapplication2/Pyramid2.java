/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author student
 */
public class Pyramid2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c=0;
        for(int i=1;i<=10;i++)
     {
         System.out.println("");
         for(int j=1;j<=i;j++)
         {  if(c!=10)
         {
             c++;
             System.out.print(c+" ");
         }
         else
             break;
         }
     }  
        // TODO code application logic here
    System.out.println("");
        // TODO code application logic here
    }
    
}
