package Formatieve_opdracht_2a;

import java.util.ArrayList;

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
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter == 'A') {
                for (Node x : this.nodes) {
                    if (x.getNaam().equals(this.huidigeNode.getNodeA())) {
                        this.outputNodes.add(x.getNaam());
                        this.huidigeNode = x;
                        break;
                    }
                }
            } else if (letter == 'B') {
                for (Node x : this.nodes) {
                    if (x.getNaam().equals(this.huidigeNode.getNodeB())) {
                        this.outputNodes.add(x.getNaam());
                        this.huidigeNode = x;
                        break;
                    }
                }
            }

        }
        System.out.println(this.outputNodes);
    }
}
