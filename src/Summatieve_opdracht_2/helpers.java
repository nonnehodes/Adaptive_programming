package Summatieve_opdracht_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

class Helpers {
    public ArrayList<Node> getFSMNodes() {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        Node s4 = new Node("s4");
        s0.setNextNodes(s1);
        s0.setNextNodes(s2);
        s0.setNextNodes(s3);

        s1.setNextNodes(s1);
        s1.setNextNodes(s2);
        s1.setNextNodes(s3);

        s2.setNextNodes(s4);
        s2.setNextNodes(s1);

        s3.setNextNodes(s2);
        s3.setNextNodes(s3);
        s3.setNextNodes(s4);

        ArrayList<Node> inputFSM = new ArrayList<>();
        inputFSM.add(s0);
        inputFSM.add(s1);
        inputFSM.add(s2);
        inputFSM.add(s3);
        inputFSM.add(s4);
        return inputFSM;
    }

    public Node getMCMNode(Integer dobbelsteen) {
        Node MCMNode = new Node("s0");
        for (int i = 1; i <= dobbelsteen; i++) {
            Node tempNode = new Node(String.format("%s", i));
            MCMNode.setNextNodes(tempNode);
        }
        return MCMNode;
    }

    public Float generateKansFactor() {
        Random rand = new Random();
        return rand.nextFloat();
    }
}
