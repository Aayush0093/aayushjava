/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area.of.triangle.using.semi.concept;

import java.util.Scanner;

/**
 *
 * @author aayushtyagi
 */
public class AreaOfTriangleUsingSemiConcept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a , b , c , sp , area ;
        
        System.out.println("Enter three sides : ");
        
        Scanner s = new Scanner(System.in);
        
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        
        sp = 0.5f * (a+b+c);
        
        area = (float) Math.sqrt((sp)*(sp-a)*(sp-b)*(sp-c));
        
        System.out.println("Area is : "+area);
        
    }
    
}
