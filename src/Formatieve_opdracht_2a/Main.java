package Formatieve_opdracht_2a;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("s0", "s2", "s1");
        Node s1 = new Node("s1", "s1", "s2");
        Node s2 = new Node("s2", null, "s3");
        Node s3 = new Node("s3", "s3", "s0");

        ArrayList<Node> nodes = new ArrayList<>();

        nodes.add(s0);
        nodes.add(s1);
        nodes.add(s2);
        nodes.add(s3);


        FSM fsm = new FSM(nodes);
        String input = "BAAB";
        fsm.run(input);
    }
}
