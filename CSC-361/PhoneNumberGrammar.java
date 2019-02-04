// Write a program that allows the user to input a character string from the keyboard, and tell the user if that string 
//complies with the US phone number grammar (that is, the one from the Practice BNF item). Your program should output that 
//string, followed by "YES" if the string is acceptable, and "NO" if it is not. So, an example output from this program could be:

import java.util.Scanner;

/**
 *
 * @author Michael Harris
 */
public class PhoneNumberGrammarnew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();
       
        phoneNumber = phoneNumber.toLowerCase();
        
        if(phoneNumber.length() == 13){
        if ((phoneNumber.charAt(0) == '(' && phoneNumber.charAt(4) == ')')&& (phoneNumber.charAt(8) == '-')){
        int valid = 1;
         for (int i = 0; i<phoneNumber.length(); i++){
            
             if (i != 0 && i!=4 && i != 8){
                 //Yes to BNF
                 if (!(Character.isDigit(phoneNumber.charAt(i)))){
                  valid = 0;
                  break;
              }
            }
         }
         if (valid == 1){
             System.out.println("Yes");
             System.exit(0);
              }  
           
            }
         }
        else{
        System.out.println("No");
        System.exit(0);   
        }
    }
}
