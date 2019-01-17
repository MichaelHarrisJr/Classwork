/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangles;

import java.util.Scanner;

/**
 *
 * @author Michael Harris Jr
 */
public class Triangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter three sides in double: ");
  double edge1 = input.nextDouble();
  double edge2 = input.nextDouble();
  double edge3 = input.nextDouble();
 
  if (Triangles.isValid(edge1, edge2, edge3))
      System.out.printf("Area: %.2f\n", Triangles.area(edge1, edge2, edge3));
  else System.out.println("Input is invalid");
 
 }
 
 public static boolean isValid(double side1, double side2, double side3) {
  return !(side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1
    + side2);
 }
 
 public static double area(double side1, double side2, double side3) {
  double s = (side1 + side2 + side3) / 2;
  double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 
  return area;
    }
    
}
