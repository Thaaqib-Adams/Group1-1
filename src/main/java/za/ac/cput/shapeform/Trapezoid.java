/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.shapeform;

/**
 *
 * @author AbelK
 */
public class Trapezoid {
    
    private String area,perimeter="";

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(String perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Trapezoid{" + "area=" + area + ", perimeter=" + perimeter + '}';
    }
    
    
}
