package Summatieve_opdracht_2;

import java.util.ArrayList;

public class FSM2a {
    ArrayList<Node> nodes;
    ArrayList<String> outputNodes = new ArrayList<>();

    public FSM2a(ArrayList<Node> allNodes) {
        this.nodes = allNodes;
    }

    public ArrayList<String> run(String input) {
        this.outputNodes = new ArrayList<>();
        Node huidigeNode = this.nodes.get(0);
        this.outputNodes.add(huidigeNode.getNaam());
        for (char ch : input.toLowerCase().toCharArray()) {
            Node volgendeNode = huidigeNode.getNextNode(ch);
            if (volgendeNode != null) {
                this.outputNodes.add(volgendeNode.getNaam());
                huidigeNode = volgendeNode;
            } else {
                break;
            }
        }
//       System.out.println(this.outputNodes);
        return this.outputNodes;
    }

}
