package Formatieve_opdracht_2b;

import java.util.ArrayList;

public class Main2b {
    public static void main(String[] args) {
        Node2b s0 = new Node2b("s0", "s1", "s2");
        Node2b s1 = new Node2b("s1", "s3", "s4");
        Node2b s2 = new Node2b("s2", "s5", "s6");
        Node2b s3 = new Node2b("s3", "s1", "1");
        Node2b s4 = new Node2b("s4", "2", "3");
        Node2b s5 = new Node2b("s5", "4", "5");
        Node2b s6 = new Node2b("s6", "6", "s2");

        ArrayList<Node2b> nodes = new ArrayList<>();

        nodes.add(s0);
        nodes.add(s1);
        nodes.add(s2);
        nodes.add(s3);
        nodes.add(s4);
        nodes.add(s5);
        nodes.add(s6);

        MCM2b mcm = new MCM2b(nodes);
        System.out.println(mcm.run());
    }
}
