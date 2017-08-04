/*
 * Ayush Malviya  * 
 * 160911166  * 
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char check;
       do{
        
        System.out.println("Enter first number, operator, second number: ");
        float a=sc.nextFloat();
        char c=sc.next().charAt(0);
        float b=sc.nextFloat();
        switch(c){
            case '+':
                System.out.println("Answer = "+(a+b));
                break;
            case '-':
                System.out.println("Answer = "+(a-b));
                break;
            case '*':
                System.out.println("Answer = "+a*b);
                break;
            case '/':
                System.out.println("Answer = "+a/b);
                break;
            default:
                System.out.println("Invalid Operator");
                
        }
    
        System.out.println("Do Another(y/n)?");
        
        
              // TODO code application logic here
       
       check=sc.next().charAt(0);
    
}while (check!='n');
}
}