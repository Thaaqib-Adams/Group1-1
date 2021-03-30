package za.ac.cput.shapeforms;

public class Cylinder {

    private String radius = "(22/7 x radius)^2 x height";
    private String height = "2( 22/7 x radius x height)";

    @Override
    public String toString() {
        return "CYLINDER -> \n Volume Formula: "+radius+" \n Surface Formula: "+getHeight();
    }

    

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    
    

    }

        

