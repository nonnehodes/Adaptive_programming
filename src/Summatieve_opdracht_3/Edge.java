package Summatieve_opdracht_3;

public class Edge {
    String id;
    Stap vertrek;
    Stap bestemming;
    int kosten;

    public Edge(String id, Stap vertrek, Stap bestemming, int kosten) {
        this.id = id;
        this.vertrek = vertrek;
        this.bestemming = bestemming;
        this.kosten = kosten;
    }

    public String getId() {
        return id;
    }

    public Stap getVertrek() {
        return vertrek;
    }

    public Stap getBestemming() {
        return bestemming;
    }

    public int getKosten() {
        return kosten;
    }
}
