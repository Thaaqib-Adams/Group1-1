package za.ac.cput.shapeforms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author tarre
 */
public class TriangleTest {
    
    private Triangle triangle1;
    private Triangle triangle2;
    private Triangle triangle3;

    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        triangle1=new Triangle();
        triangle2=new Triangle();
        triangle3=triangle1;
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testEquality(){
        assertEquals(triangle1,triangle1);
    }
    
    @Test
    public void testIdentity(){
        assertSame(triangle1,triangle3);
    }
    @Test
    public void testNotSameIdetity(){
        assertNotSame(triangle1,triangle2);
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    @Timeout(50)
    public void testTimeout(){
        System.out.println("Timeed out");
    }
    @Disabled
    @Test
    public void testAnotherMethed(){
        System.out.println("This method has been disabled");
    }
    
}
