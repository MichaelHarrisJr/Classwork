/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelharrs.pkg12.pkg3.arrayindexoutofbounds;


import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author Michael Harris Jr
 */
public class Michaelharrs123Arrayindexoutofbounds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in); 
    Random r=new Random();
   
    int n=100,i;
    int []a=new int[n];
    
    for(i=0;i<n;i++)
        a[i]=r.nextInt();
    
    for(i=0;i<n;i++)
    
    {System.out.print(a[i]+" ");
    
    if((i+1)%10==0)
        
         System.out.println();
    
    for(; ;) {
       System.out.print("Enter an Index: ");
              
   
    i=in.nextInt();
    
    if(i<0||i>=n)
        System.out.println("index Out of Bounds.");
    else
        System.out.println(a[i]);
       
         }
    }
}