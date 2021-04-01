package za.ac.cput.shapeforms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

//Student Name - Fayaad Abrahams
//Student Number - 218221630
public class CylinderTest {

    private Cylinder ob1;
    private Cylinder ob2;
    private Cylinder ob3;

    public CylinderTest() {

    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        ob1 = new Cylinder();
        ob2 = new Cylinder();
        ob3 = new Cylinder();
        ob1 = ob2;
    }

    @AfterEach
    public void tearDown() {
    }

    //Testing Equality
    @Test
    public void testIdentity() {
        assertSame(ob1, ob2);

    }

    //Testing Timeouts
    @Test
    @Timeout(value = 100)
    public void timeOutTest() {
        System.out.println("This test will pass");

    }

    //Testing Equality
    @Test
    public void testEquality() {
        assertEquals(ob2, ob3);

    }

    //Failing Test
    @Test
    public void failTest() {
        fail("Failed");
    }

    //Not executed
    @Test
    @Disabled
    public void delibTest() {
        System.out.println("This test will never run");
    }

}
