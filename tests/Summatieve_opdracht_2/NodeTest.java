package Summatieve_opdracht_2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void getNaam() {
        Node s1 = new Node("s1");
        assertEquals("s1", s1.getNaam());
    }

    @Test
    void setNextNodes() {
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");

        s1.setNextNodes(s2);

        assertEquals(s2, s1.getNextNode("a".charAt(0)));
    }

    @Test
    void getNextNode() {
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");

        s1.setNextNodes(s2);

        assertEquals(s2, s1.getNextNode("a".charAt(0)));
    }

    @Test
    void getAllNextNodes() {
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        s1.setNextNodes(s2);
        s1.setNextNodes(s3);

        ArrayList<Node> testArray = new ArrayList<>();
        testArray.add(s2);
        testArray.add(s3);

        assertEquals(testArray, s1.getAllNextNodes());
    }
}