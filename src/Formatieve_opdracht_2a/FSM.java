package Formatieve_opdracht_2a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FSM {
    private ArrayList<Node> nodes;
    private Node huidigeNode;
    ArrayList<String> outputNodes = new ArrayList<>();

    public FSM(ArrayList<Node> aln) {
        this.nodes = aln;
        this.huidigeNode = nodes.get(0);
        this.outputNodes.add(this.huidigeNode.getNaam());
    }

    public void run(String input) {
        Boolean failed = false;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter == 'A') {
                for (Node x : this.nodes) {
                    if (x.getNaam().equals(this.huidigeNode.getNodeA())) {
                        this.outputNodes.add(x.getNaam());
                        this.huidigeNode = x;
                        break;
                    } else {
                        failed = true;
                    }
                }
            } else if (letter == 'B') {
                for (Node x : this.nodes) {
                    if (x.getNaam().equals(this.huidigeNode.getNodeB())) {
                        this.outputNodes.add(x.getNaam());
                        this.huidigeNode = x;
                        failed = false;
                        break;
                    } else {
                        failed = true;
                    }
                }
            }

        }
        if (failed == true) {
            System.out.println("For node: " + this.outputNodes.get(this.outputNodes.size() - 1));
            System.out.println("No follow up connection found");
        }
        System.out.println("Followed path: " + this.outputNodes);
    }
}
