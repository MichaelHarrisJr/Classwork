/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Michael Harris Jr
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    //Not accept numbers
    String y = "";
    do {
        
    System.out.print("Enter your palindrome: "); 
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    
        if (sentencePalindrome(str)){
           System.out.println(str + " is a Palindrome.");
        }
        
        else {
           System.out.println(str + " is not a Palindrome.");
       
        }
           System.out.print("Do you wanna enter another pallindrome[Y/N]: ");
           y = input.next();
        
    } while (y.equalsIgnoreCase("Y"));
    }

    static boolean sentencePalindrome(String str) 
    {         
        str = str.toLowerCase();
        int strPos = 0;
        for(int position = str.length() - 1; position >= 0; position--)
        {
            
            if ((!(str.charAt(position) >= 'a' && str.charAt(position) <= 'z')) 
                    || (str.charAt(position) == ' '))
            {                   
                
                if(position == 0)
                    return true;
                else 
                    position--;
            }
            
            if ((!(str.charAt(strPos) >= 'a' && str.charAt(strPos) <= 'z')) 
                    || (str.charAt(strPos) == ' '))
            {
            
                if(strPos == (str.length() - 1))
                    return true;
                else 
                    strPos++;
            }

            if(!(str.charAt(strPos)== str.charAt(position)))
                return false;
           
            strPos++;
            
        }
        return true;
    } 
                 
} 
