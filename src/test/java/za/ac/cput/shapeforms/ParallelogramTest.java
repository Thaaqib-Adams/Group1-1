package za.ac.cput.shapeforms;
//Student Name - Thaaqib Adams
// Student Number - 220065810

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout ;
import org.junit.jupiter.api.Disabled ;

public class ParallelogramTest {
    
    public ParallelogramTest() {
    }
    private Parallelogram Pllg1 ;
    private Parallelogram Pllg2 ;
    private Parallelogram Pllg3 ;
            
    @BeforeEach
    public void setUp() 
    {
      Pllg1 = new Parallelogram() ;  
       Pllg2 = new Parallelogram() ; 
        Pllg3 = Pllg1;
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    @Test
    public void testEquality() 
    {
       assertEquals(Pllg1, Pllg3) ;
    }

   
    @Test
    public void testidentity() 
    {
       assertSame(Pllg1, Pllg3) ;
    }

    
    @Test
    public void testmethod() 
    {
     assertSame(Pllg1, Pllg3) ;
     
     fail("This is a prototype") ;
    }

    @Timeout(90)
    @Test
    public void testTimeout() {
        System.out.println("Yeah timeout");
      
    }

   @Disabled
    @Test
    public void testDisabled() {
       System.out.println("Yesssiiiirrr.");
    }
    
}
