/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Abel Kabeya 217174183
 * 
 * Test Class to test methods
 */
public class TrapezoidTest {

    private Trapezoid trapezoid1;
    private Trapezoid trapezoid2;
    private Trapezoid trapezoid3;

    @BeforeEach
    public void setUp() {

        trapezoid1 = new Trapezoid();
        trapezoid2 = new Trapezoid();
        trapezoid3 = trapezoid1;

    }

    @Test//Testing object Identity
    public void testIdentity() {
        assertSame(trapezoid1, trapezoid3);
    }

    @Test//Testing object Equality
    public void testEquality() {
        assertEquals(trapezoid1, trapezoid3);

    }

    @Test//Deliberately fail a test
    public void testSomeMethod() {
        fail("The test case is a prototype.");
            }

    @Timeout(5)//Timeout
    @Test
    public void testTimeOut() {
        System.out.println("Time meout");

    }

    @Disabled//Disable test
    @Test
    public void testThisMethod() {
        System.out.println("Test me");

    }

}
