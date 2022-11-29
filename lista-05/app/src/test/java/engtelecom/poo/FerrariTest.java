package engtelecom.poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FerrariTest {
    @Test
    public void ConversibleTest() {
        Ferrari f1 = new Ferrari();
        f1.speedUp(12);

        // Test opening and closing conversible
        assertEquals("Current speed is 12.0", f1.getSpeed());
        assertEquals("Conversible is already open", f1.openCoversive());
        assertEquals("Closing Conversible", f1.closeCoversive());
        assertEquals("Conversible is already closed", f1.closeCoversive());

        assertEquals("Opening Conversible", f1.openCoversive());

        f1.speedUp(9);
        assertEquals("Speed must be lower than 20 km/h", f1.closeCoversive());

    }

    @Test
    public void speedTest() {
        Ferrari f1 = new Ferrari();
        f1.speedUp(250);
        assertEquals("Current speed is 200.0", f1.getSpeed());

        f1.brake(200);
        assertEquals("Current speed is 0.0", f1.getSpeed());
    }

    @Test
    public void foglampTest() {
        Ferrari f1 = new Ferrari();

        assertEquals("foglamp is turn on", f1.toggleFoglamp());
        assertEquals("foglamp is turn off", f1.toggleFoglamp());

    }
}
