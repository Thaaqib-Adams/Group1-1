package za.ac.cput.shapeforms;

/**
 *
 * @author tarre
 */
public class Triangle {
    private double height;
    private double base;
    private int s1,s2,s3;
    private String area="2/(b*h)";
    private String parimeter="s1 + s2 + s3";

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getParimeter() {
        return parimeter;
    }

    public void setParimeter(String parimeter) {
        this.parimeter = parimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" + "area=" + area + ", parimeter=" + parimeter + '}';
    } 
}
