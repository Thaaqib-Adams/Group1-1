package za.ac.cput.shapeforms;
// Student Name - Moegammad Tasreeq Adams
// Student number 216173027

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void testEquality() {
        Circle circle1 = new Circle(9, 254.47);
        Circle circle2 = new Circle(9, 254.47);
        assertEquals(circle1, circle2);
    }

    @Test
    public void testIdentity() {
        Circle circle1 = new Circle(9, 254.47);
        Circle circle2 = circle1;
        assertSame(circle1, circle2);
    }

    @Test
    public void failingEqualityTest() {
        Circle circle1 = new Circle(9, 254.47);
        Circle circle2 = new Circle(5, 78.54);
        assertEquals(circle1, circle2);
    }

    @Test
    void circleTimeOutTest() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            Circle circle1 = new Circle(9, 254.47);
            Circle circle2 = new Circle(5, 78.54);
        });
    }

    @Disabled("Disabled for Disable test!")
    @Test
    void circleDisableTest() {
        Circle circle1 = new Circle(9, 254.47);
        Circle circle2 = new Circle(9, 254.47);
        assertEquals(circle1, circle2);
    }

}
