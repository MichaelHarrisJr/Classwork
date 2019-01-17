/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg3;

import java.util.Scanner;

/**
 *
 * @author Michael Harris Jr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
    Scanner in=new Scanner (System.in);
    System.out.print("Enter a postive integer: ");
    n=in.nextInt();
    if(isPalindrome(n))
         System.out.println(n+" is a palindrome");
    else
           System.out.println(n+" is not a palindrome");

            }

public static boolean isPalindrome(int number)
{
    return number==reverse(number);
}
public static int reverse(int number)
{
    int num =0,value;
while(number!= 0)
   {value = number%10;
    number/=10;
    num = num * 10 + value;
    }
return num;
    }
    
}
