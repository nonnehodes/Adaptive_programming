package Summatieve_opdracht_2;

import java.util.ArrayList;

public class Node {
    private ArrayList<Node> nextNodes = new ArrayList<Node>();
    private String naam;

    public Node(String nm) {
        this.naam = nm;
    }

    public String getNaam() {
        return this.naam;
    }

    public void setNextNodes(Node node) {
        this.nextNodes.add(node);
    }

    public Node getNextNode(Character input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Integer i = alphabet.indexOf(input);
        try {
            return nextNodes.get(i);
        } catch (Exception e){
            System.out.println("Dead end at " + this.naam );
            return null;
        }
    }

    public ArrayList<Node> getAllNextNodes() {
        return this.nextNodes;
    }
}
