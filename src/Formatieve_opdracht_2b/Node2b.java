package Formatieve_opdracht_2b;

public class Node2b {
    String naam;
    String node1;
    String node2;
    String dobbelsteen1;
    String dobbelsteen2;

    public Node2b(String nm, String n1, String n2, String ds1, String ds2 ) {
        this.naam = nm;
        this.node1 = n1;
        this.node2 = n2;
        this.dobbelsteen1 = ds1;
        this.dobbelsteen2 = ds2;
    }
    public String getNaam() {
        return this.naam;
    }

    public String getNode1(){
        return this.node1;
    }
    public String getNode2(){
        return this.node2;
    }
}
