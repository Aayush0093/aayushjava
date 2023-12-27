/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadratic.equation;
import java.util.Scanner;
/**
 *
 * @author aayushtyagi
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float r1, r2;
        int a , b , c ;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the coefficient of x^2 : ");
        a = s.nextInt();
        System.out.println("Enter the coefficient of x^1 : ");
        b = s.nextInt();
        System.out.println("Enter the coefficient of x^0 : ");
        c = s.nextInt();
        
        r1 = (-b + ((float) (Math.sqrt(b*b - 4*a*c))))/(2f * a);
        
        r2 = (-b - ((float) (Math.sqrt(b*b - 4*a*c))))/(2f * a);
                
        System.out.println(a+"x^2 + "+b+"x^1 + "+c+"x^0");
        
        System.out.println("r1 : "+r1);   
        System.out.println("r2 : "+r2);   
        
    }
    
}
