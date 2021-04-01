package za.ac.cput.shapeforms;

import java.util.Objects;

// Student Name - Moegammad Tasreeq Adams
// student Number -  216173027
public class Circle {

    private double radius;

    private double pi = 3.14;
    private double area = getPi() * (getRadius() * getRadius());

    public Circle(double radius, double area) {
        this.radius = pi;
        this.area = area;

    }

    Circle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + ", pi=" + pi
                + ", area=" + area
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Double.compare(circle.pi, pi) == 0 && Double.compare(circle.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, pi, area);
    }

}
