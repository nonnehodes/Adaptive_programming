package Summatieve_opdracht_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MCM2bTest {

    @Test
    void getDobbelGetal() {
        Helpers hp = new Helpers();
        Node node = hp.getMCMNode(4);
        MCM2b mcm = new MCM2b(node);

        assertEquals("1", mcm.getDobbelGetal(0));
        assertEquals("2", mcm.getDobbelGetal(1));
        assertEquals("3", mcm.getDobbelGetal(2));
        assertEquals("4", mcm.getDobbelGetal(3));
    }

    @Test
    void generateKansFactor() {
        Helpers hp = new Helpers();
        Node node = hp.getMCMNode(4);
        MCM2b mcm = new MCM2b(node);

        float random = mcm.generateKansFactor();
        float high = 1;
        float low = 0;
        assertTrue(high >= random, "Error, random is too high");
        assertTrue(low  <= random, "Error, random is too low");
    }
}