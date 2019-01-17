/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtriangle;

import java.lang.String;
import java.util.Date;

public abstract class GeometricObject {
    private final Date dateCreated = new Date();
    
    protected GeometricObject() {}

    public Date getDateCreated() {return this.dateCreated;}

    @Override  // java.lang.Object.toString()
    public String toString() {return "created on " + this.getDateCreated();}

    public abstract double getArea();
    public abstract double getPerimeter();

}
