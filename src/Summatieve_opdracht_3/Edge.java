package Summatieve_opdracht_3;

import java.util.Random;

public class Edge {
    String id;
    Stap vertrek;
    Stap bestemming;
    int kosten;
    String type;

    public Edge(String id, Stap vertrek, Stap bestemming, int kosten, String type) {
        this.id = id;
        this.vertrek = vertrek;
        this.bestemming = bestemming;
        if (type.equals("vliegtuig")) {
            Random rand = new Random();
            this.kosten = kosten + (int) Math.round(rand.nextFloat() * 100.0);
        } else {
            this.kosten = kosten;
        }
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public Stap getVertrek() {
        return this.vertrek;
    }

    public Stap getBestemming() {
        return this.bestemming;
    }

    public int getKosten() {
        return this.kosten;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "vertrek=" + vertrek +
                ", bestemming=" + bestemming +
                ", kosten=" + kosten +
                '}';
    }
}
