package Formatieve_opdracht_2a;

public class Node {
    private String nodeA;
    private String nodeB;
    private String naam;

    public Node(String nm, String a, String b){
        this.naam = nm;
        this.nodeA = a;
        this.nodeB = b;
    }

    public String getNaam() {
        return this.naam;
    }

    public String getNodeA(){
        return this.nodeA;
    }
    public String getNodeB(){
        return this.nodeB;
    }

}
