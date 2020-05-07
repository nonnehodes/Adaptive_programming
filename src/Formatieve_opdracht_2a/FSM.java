package Formatieve_opdracht_2a;

import java.util.ArrayList;

public class FSM {
    private ArrayList<Node>nodes;
    private Node huidigeNode;

    public FSM(ArrayList<Node> aln){
        nodes = aln;
        huidigeNode = nodes.get(0);

    }

    public void Run(String input){
        for (int i = 0; i < input.length(); i++){
            char letter = input.charAt(i);

        }
    }
}
