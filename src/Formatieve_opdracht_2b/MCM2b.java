package Formatieve_opdracht_2b;


import java.util.ArrayList;
import java.util.Random;


public class MCM2b {
    private ArrayList<Node2b> nodes;
    private Node2b huidigeNode2b;

    public MCM2b(ArrayList<Node2b> aln) {
        this.nodes = aln;
        this.huidigeNode2b = nodes.get(0);
    }

    public Float generateKansFactor() {
        Random rand = new Random();
        System.out.println("Kans factor: " + rand.nextFloat());
        return rand.nextFloat();
    }

    public String run() {
        String flag = this.huidigeNode2b.getNaam();
        while (flag.substring(0, 1).equals("s")) {
            Float kansFactor = this.generateKansFactor();
            if (kansFactor <= 0.5) {
                for (Node2b x : this.nodes) {
                    if (!this.huidigeNode2b.getNode1().substring(0, 1).equals("s")) {
                        return "Dobbelsteenworp: " + this.huidigeNode2b.getNode1();
                    }
                    if (x.getNaam().equals(this.huidigeNode2b.getNode1())) {
                        flag = this.huidigeNode2b.getNode1();
                        this.huidigeNode2b = x;
                        break;
                    }
                }
            } else if (kansFactor > 0.5) {
                for (Node2b x : this.nodes) {
                    if (!this.huidigeNode2b.getNode2().substring(0, 1).equals("s")) {
                        return "Dobbelsteenworp: " + this.huidigeNode2b.getNode2();
                    }
                    if (x.getNaam().equals(this.huidigeNode2b.getNode2())) {
                        flag = this.huidigeNode2b.getNode2();
                        this.huidigeNode2b = x;
                        break;
                    }
                }
            }
            System.out.println("Gaat naar: " + flag);
        }
        return flag;
    }
}

