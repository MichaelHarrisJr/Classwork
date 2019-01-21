/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelharris.chapter12.pkg2;

import java.util.Scanner;

/**
 *
 * @author Michael Harris Jr
 */
public class MichaelharrisChapter122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    
        System.out.println("Enter the two numbers");
    int num1;
    int num2;
try {
    num1 = scanner.nextInt();
    
    num2 = scanner.nextInt();
    
    int sum = num1 + num2;
        
        System.out.println("Sum is : " + sum);
} catch (Exception ex) {
        
        System.out.println("Invaild integers please re-enter again ");
        
}
    }
    
}
