/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.shapeform;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Abel kabeya 217174183
 */
public class TrapezoidTest {

    private Trapezoid trapezoid1;
    private Trapezoid trapezoid2;
    private Trapezoid trapezoid3;

    @Before
    public void setUp() {

        trapezoid1 = new Trapezoid();
        trapezoid2 = new Trapezoid();
        trapezoid3 = trapezoid1;
    }
    
    
    @Test(timeout=1000)//timeout test
    public void testIdentity() {
        assertSame(trapezoid1, trapezoid3);

    }

    @Test
    public void testEquality() {
        assertEquals(trapezoid1, trapezoid3);

    }

    @Test
    // Testing print
    public void testPrint() {
        System.out.println("Trapezoid");
        fail("Test string");//deliberate failing test

    }

    @Ignore // Disabling Test
    @Test
    // Testing Output
    public void testOutput() {
        System.out.println("Testing output");

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
