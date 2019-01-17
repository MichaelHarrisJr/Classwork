/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtriangle;

import java.lang.System;
import java.lang.String;
import java.lang.Math;
import testtriangle.Triangle;
public class TestTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1);
        System.out.println("Area: " + Math.round(triangle1.getArea() * 100.0) / 100.0);
        System.out.println("Perimeter: "  + triangle1.getPerimeter());
        System.out.println();
        
        Triangle triangle2 = new Triangle(0.9, 1.5, 1.1);
        System.out.println(triangle2);
        System.out.println("Area: " + Math.round(triangle2.getArea() * 100.0) / 100.0);
        System.out.println("Perimeter: "  + triangle2.getPerimeter());
    }
    
}
