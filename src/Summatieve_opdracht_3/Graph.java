package Summatieve_opdracht_3;

import java.util.List;

public class Graph {
    List<Stap> stappen;
    List<Edge> edges;

    public Graph(List<Stap> stappen, List<Edge> edges) {
        this.stappen = stappen;
        this.edges = edges;
    }

    public List<Stap> getStappen() {
        return stappen;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
