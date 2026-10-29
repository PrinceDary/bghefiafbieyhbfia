/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author MEJILLANO_CPE113
 */
public class JavaApplication2 {

   
    public static void main(String[] args) {
       
        Scanner OE = new Scanner (System.in);
        System.out.println("Enter a number:");
        int num = OE.nextInt(); 
        System.out.print("Result: ");
        System.out.println(M1 (num));
        
        
        classifyTriangle (1, 1, -3);
    }
    
    static int M1 (int num) {
        int res = 0;
        if (num % 2 == 0) {
        res = 1;
            } else {
        res = 0;
        } 
        return res;
    } 
    
    static int classifyTriangle (int side1, int side2, int side3) {
        int res2 = 0;
            if (side1 == side2 && side2 == side3 && side1 == side3) {
                res2 = 1;
            } else if (side1 == side2 && side1 != side3 && side2 != side3) {
                res2 = 2;
            } else if (side1 != side2 && side2 == side3 && side1 != side3) {
                res2 = 2; 
            } else if (side1 != side2 && side2 != side3 && side1 == side3) {
                res2 = 2;
            } else if (side1 != side2 && side2 != side3 && side1 != side3) {
                res2 = 3;
            } else if (side1 < 0 || side2 < 0 || side3 < 0){
                res2 = 0;
            } if (res2 == 1) {
                System.out.println("The triangle is Equilateral");
            } else if (res2 == 2) {
                System.out.println("The triangle is Isosceles.");
            } else if (res2 == 3) {
                System.out.println("The triangle is Scalene");
            } return res2;
    } 
    
    
    
    
}
