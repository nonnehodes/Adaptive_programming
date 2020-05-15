package Summatieve_opdracht_2;


import Formatieve_opdracht_2b.Node2b;

import java.util.ArrayList;
import java.util.Random;


public class MCM2b {
    Node MCMNode;

    public String getDobbelGetal(Integer i) {
        return this.MCMNode.getAllNextNodes().get(i).getNaam();
    }

    public MCM2b(Node MCMNode) {
        this.MCMNode = MCMNode;
    }

    public Float generateKansFactor() {
        Random rand = new Random();
        return rand.nextFloat();
    }

    public String run() {
        float random = this.generateKansFactor();
        System.out.println("Kans factor: " + random);
        float kansPerNode = 1 / (float) this.MCMNode.getAllNextNodes().size();
        double lowerbracket = 0;
        for (int i = 0; i < this.MCMNode.getAllNextNodes().size(); i++) {
            if (i != 0) {
                lowerbracket += kansPerNode;
            }
            float upperbracket = kansPerNode*(i+1);
            System.out.println("Lower bracket: " + lowerbracket);
            System.out.println("Upper bracket: " + upperbracket);
            if (random > lowerbracket && random < upperbracket) {
                return this.getDobbelGetal(i);
            }
        }
        return "";
    }
}

