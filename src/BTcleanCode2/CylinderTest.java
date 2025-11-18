package BTcleanCode2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(22, 23)")
    void testGetVolume0And0() {
        int radius = 22;
        int height = 23;
        double expected = 3192.92;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(3, 9)")
    void testGetVolume1And2() {
        int radius = 3;
        int height = 9;
        double expected = 207.35;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}
