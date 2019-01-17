/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelharrs.chinesezodiac;

import java.util.Scanner;

/**
 *
 * @author inuya_000
 */
public class MichaelHarrsChineseZodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter any year: ");
int year = input.nextInt();
int n=year%12;
String[] zodiac = { "monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon", "snake", "horse", "sheep"};
{
System.out.println(" Zodiac Sign is "+ zodiac[n]);

    }    
 }   
}







