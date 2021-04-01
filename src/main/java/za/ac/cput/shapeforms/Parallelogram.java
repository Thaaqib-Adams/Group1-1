package za.ac.cput.shapeforms;

//Student Name - Thaaqib Adams
// Student Number - 220065810
public class Parallelogram 
    
{
    private String area, perimeter;

    public Parallelogram() {

        this.area = "Base x height";
        this.perimeter = "2Area + 2Base";

    }

    public String getArea() 
    {
        return area;
    }

    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getPerimeter() 
    {
        return perimeter;
    }

    public void setPerimeter(String perimeter) 
    {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() 
    {
        return "The formular for area for parallelogram is " + area + ", The formular for perimter for paralleogram is " + perimeter + "";
    }
    
    
}

