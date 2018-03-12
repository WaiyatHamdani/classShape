/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author 00220682
 */
public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder(double height, Circle base) {
        this.height = height;
        this.base = base;
    }
    
    public Cylinder(double height, double radius){
        this.height = height;
        base = new Circle(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }
    
    public double getVolume(){
        return base.getArea() * height;
    }
    
    public double getLateralArea(){
        return base.getCircumference() * height;
    }
    
    public double getSurfaceArea(){
        return getLateralArea() + (2 * base.getArea());
    }
}
