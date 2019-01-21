/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtriangle;

/**
 *
 * @author Michael Harris Jr
 */
class Triangle extends GeometricObject {
    private double side1, side2, side3;
    
    public Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    public Triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3; 
    }
    @Override
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s *(s - side1)*(s - side2)*(s - side3));
    }
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    @Override
    public String toString(){
        return "TriangleNew: side 1 = " + side1 + ", side 2 = " + side2 + ", side 3 = " + side3;
    }
}
