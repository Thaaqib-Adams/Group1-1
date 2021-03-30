package za.ac.cput.shapeforms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.*;

//Please create your own Java file in the src/ folder and then create an associated Test file with it
public class demoTest {

    Rectangular shape = null;
    Rectangular square = null;

    public demoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        double len = 5;
        double wid = 5;
        double height = 5;

        square = new Rectangular(5, 5, 5);
        shape = new Rectangular(len, wid, height);

        shape = square;
    }

    @Test
    public void calculateSurface()
    {
        double result = .0d;
        result = shape.calculateSurface();
        Assert.assertEquals(150, result, 0.1);
    }

    @Test
    public void isObjectEqual()
    {
        Assert.assertEquals(shape, square);
    }

    @AfterEach
    public void tearDown() {
    }
}