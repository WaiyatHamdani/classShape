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
public class TestCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(2,3);
        Cylinder cylinder2 = new Cylinder(3, new Circle(4));
        System.out.println("Cylinder 1 height: " + cylinder1.getHeight());
        System.out.println("Cylinder 2 radius: " + cylinder2.getBase().getRadius());
        System.out.println("Cylinder 1 volume: " + cylinder1.getVolume());
        System.out.println("Cylinder 2 surface area: " + cylinder2.getSurfaceArea());
        cylinder1.setHeight(cylinder2.getHeight());
        System.out.println(cylinder1.getVolume());
        cylinder2.setBase(cylinder1.getBase());
        System.out.println(cylinder1.getBase() +":" + cylinder2.getBase());
    }
    
}
