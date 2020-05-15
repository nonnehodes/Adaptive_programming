package Summatieve_opdracht_2;

import Formatieve_opdracht_2a.FSM;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FSM2aTest {

    @Test
    void run() {
        Helpers hp = new Helpers();
        FSM2a fsm = new FSM2a(hp.getFSMNodes());

        assertEquals("s3", fsm.run("abbaac").get(6));
        assertEquals("s4", fsm.run("cabba").get(5));
        assertEquals("s2", fsm.run("BbAcBa").get(6));
    }
}