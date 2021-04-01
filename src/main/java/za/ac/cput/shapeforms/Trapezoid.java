package za.ac.cput.shapeforms;

//Student Name - Abel_Kabeya 
//Student Number - 217174183
public class Trapezoid {

    private String area = " (base 1 + base 2)/2*height";
    private String perimeter = " Add lenghts of all side";

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

    public void printOnScreen() {

        System.out.println("Below is the Area and Perimeter formula for the shape Trapezoid\n");

    }

    @Override
    public String toString() {
        return "Trapezoid\n" + "Area = " + area + "\nPerimeter = " + perimeter + "";
    }

}
