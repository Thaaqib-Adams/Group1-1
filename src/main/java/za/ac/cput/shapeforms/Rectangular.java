/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.shapeforms;
import java.util.Scanner;
/**
 *
 * @author imraan_219361738
 */
public class Rectangular {
    
    private double length, width, height;
    private double surfOf_lxh;
    private double surfOf_lxw;
    private double surfOf_hxw;
    private double volume;
    private double surface;
    
    public Rectangular()
    {
        length = 0;
        width = 0;
        height = 0;
    } 

    public Rectangular(double length, double width, double height) 
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateSurface()
    {
        surfOf_lxh = 2*(this.length*this.height);
        surfOf_lxw = 2*(this.length*this.width);
        surfOf_hxw = 2*(this.height*this.width);
        
        surface = surfOf_lxh + surfOf_lxw + surfOf_hxw;
        return this.surface;
    }

    public double calculateVolume()
    {
        volume = this.length*this.width*this.height;
        return this.volume;
    }

    public String displayResults()
    {
        return ("*******************************************\n"
                + "the values you have entered are as followed: \n\n"
                            + "length = " + this.length + "\n"
                            + "height = " + this.height + "\n"
                            + "width = " + this.width + "\n");
    }  
}
