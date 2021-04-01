package za.ac.cput.shapeforms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

/**
 *
 * @author imraan_219361738
 */
public class demoTest {

    Rectangular shape_01 = null;
    Rectangular shape_02 = null;

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

        shape_01 = new Rectangular(len, wid, height);
        shape_02 = new Rectangular(5, 5, 5);

        shape_01 = shape_02;
    }
// ******************************Working test******************************
    @Test
    public void calculateSurface()
    {
       double result;
        result = shape_01.calculateSurface();
        assertEquals(150, result);
    }
    @Test
    public void calculateVolume()
    {
        double result;
        result = shape_01.calculateVolume();
        assertEquals(125, result);
    }

//******************************Object equality ******************************
    @Test
    public void isObjectEqual()
    {
        assertEquals(shape_01, shape_02);
    }

    @AfterEach
    public void tearDown() {
    }

//******************************Object identity******************************
    @Test
    public void isObjectIdentical()
    {
        assertSame(shape_01, shape_02);
    }

//******************************Failing test******************************
    @Test
    public void failingTest()
    {
        double result = 15;
        assertEquals(result, 10);
    }
    
//******************************Object timeout******************************
    @Test
    @Timeout (value = 1000)
    public void testTimeOut()
    {
        System.out.println("checks the runtime of this particular methord");
    }

 //******************************Disabled Test******************************
    @Test
    @Disabled
    public void disablingTest()
    {
        double result;
        result = shape_01.calculateVolume();
        assertEquals(125, result);
    }

}