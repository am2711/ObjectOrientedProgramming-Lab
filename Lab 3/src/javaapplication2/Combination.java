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
public class Combination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4 };
        int count =0;
        System.out.println("Case 2:");
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    for(int w = 0 ; w < 4 ; w++) {
                        
                    if ( x!= y && x!=z && x!=w && y!= z && y!=w && z!=w) {
                        System.out.println(input[x] + "" + input[y] + "" + input[z] +""+ input[w]);
                        count++;
                    }
                  }
                }
            }
        }
        System.out.println("Case 1:");
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    for(int w = 0 ; w < 4 ; w++) {
                         System.out.println(input[x] + "" + input[y] + "" + input[z] +""+ input[w]);
                       
                    }
                  }
                }
            }
        }
 
        // TODO code application logic here
    }
