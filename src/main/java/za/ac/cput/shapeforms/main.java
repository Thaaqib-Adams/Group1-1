package za.ac.cput.shapeforms;
import java.util.Scanner;

public class main {
//We will call all of the classes from here, don't worry if there's nothing here
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        
        System.out.println("FORMULA FOR CALCULATING A RECTANGULAR PRISM");
        System.out.println("******************************************* \n");
        
        System.out.println("1: Please input in the rectangular's length: ");
        double lgt = object.nextDouble();
        
        System.out.println("2: Please input in the rectangular's width: ");
        double wdt = object.nextDouble();
        
        System.out.println("3: Please input in the rectangular's height: ");
        double hgt = object.nextDouble();
        
        Rectangular shape = new Rectangular(lgt, wdt, hgt);
         
        System.out.println(shape.displayResults());
        shape.calculateVolume();
        shape.calculateSurface();
    }

}
