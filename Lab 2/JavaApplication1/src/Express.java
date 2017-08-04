/*
 * Ayush Malviya  * 
 * 160911166  * 
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Express {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
        System.out.println((a<<2)+(b>>2));
        System.out.println(b>0);
        System.out.println((a+b*100)/10);
        System.out.println(a&b);
    
        // TODO code application logic here
    }
    
}
