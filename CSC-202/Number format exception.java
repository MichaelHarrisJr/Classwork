/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelharris.pkg12.pkg6.numberformatexception;

import java.util.Scanner;

/**
 *
 * @author Michael Harris Jr
 */
public class Michaelharris126Numberformatexception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.print("Enter Hexadecimal: ");
      
Scanner input = new Scanner(System.in);
        boolean isValid = false;
            String hex = "";
                int decimal = 0;
        while (!isValid) {
            try {
               
                hex = input.nextLine();
                decimal = hexToDecimal(hex);
                isValid = true;
            } catch (NumberFormatException ex) {
                
                System.out.println("Try again...");
            }

        }
        System.out.println("The decimal value for hex number "
                + hex + " is: " + decimal);
    }

    public static int hexToDecimal(String hex) throws NumberFormatException {
        
        
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }


    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else 
            return ch - '0';
    }
    
}
