package Engtelecom.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RackTest {

    @Test
    void rackTest() {
        Rack r = new Rack();
        assertTrue(r.addRealMachine("TesteRM", 16, 250));

    }

}
