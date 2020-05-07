package Formatieve_opdracht_2a;

public class Node {
    private Node nodeA;
    private Node nodeB;
    private String naam;

    public Node(String nm){
        naam = nm;
    }

    public void setNodeA(Node n){
        nodeA = n;
    }

    public void setNodeB(Node n){
        nodeB = n;
    }

    public Node getNodeA(){
        return this.nodeA;
    }
    public Node getNodeB(){
        return this.nodeB;
    }

}
