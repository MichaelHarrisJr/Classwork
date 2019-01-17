/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortthreenumbers;

import java.util.Scanner;

/**
 *
 * @author Michael Harris Jr
 */
public class SortThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);        

    System.out.print("Enter three value: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();		
    double num3 = input.nextDouble();				
		
    SortThreeNumbers.displaySortedNumbers(num1, num2, num3);	
    }

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		double temp; // Hold number to swap
		
		if (num2 < num1 && num2 < num3){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if (num3 < num1 && num3 < num2) {
			temp = num1; 
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
	
		System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
    }
    
}
