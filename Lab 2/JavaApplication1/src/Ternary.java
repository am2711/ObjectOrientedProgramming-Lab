/*
 * Ayush Malviya  * 
 * 160911166  * 
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Ternary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int lar=(a>b)?((a>c)?a:c):((b>c)?b:c);
        int sma=(a<b)?((a<c)?a:c):((b<c)?b:c);// TODO code application logic here
        System.out.println("Largest is: "+lar);
        System.out.println("Smallest is: "+sma);
    }
    
}
