package Summatieve_opdracht_3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Reis {
    String type;
    ArrayList<Stap> nodes = new ArrayList<>();
    ArrayList<Edge> edges = new ArrayList<>();
    Graph graph;

    public Reis(String type) {
        this.type = type;
        for (int i = 0; i < 11; i++) {
            Stap location = new Stap("Node_" + i, "Node_" + i);
            nodes.add(location);
        }

        this.edges.add(addLane("Edge_0", 0, 1, 85, type));
        this.edges.add(addLane("Edge_1", 0, 2, 150, type));
        this.edges.add(addLane("Edge_2", 0, 4, 300, type));
        this.edges.add(addLane("Edge_3", 2, 6, 186, type));
        this.edges.add(addLane("Edge_4", 2, 7, 103, type));
        this.edges.add(addLane("Edge_5", 3, 7, 183, type));
        this.edges.add(addLane("Edge_6", 5, 8, 250, type));
        this.edges.add(addLane("Edge_7", 8, 9, 84, type));
        this.edges.add(addLane("Edge_8", 7, 5, 167, type));
        this.edges.add(addLane("Edge_9", 4, 9, 150, type));
        this.edges.add(addLane("Edge_10", 9, 10, 40, type));
        this.edges.add(addLane("Edge_11", 1, 10, 250, type));
        this.edges.add(addLane("Edge_12", 0, 3, 50, type));

        this.graph = new Graph(this.nodes, this.edges);
    }

    public void run() {

        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(this.graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Stap> path = dijkstra.getPath(nodes.get(8));

        for (Stap stap : path) {
            System.out.println(stap.naam);
        }

        switch (type) {
            case "vliegtuig":
                System.out.println("Vlucht kost " + path.getLast().distance + " euro \n");
                break;
            case "trein":
                System.out.println("De treinreis duurde " + path.getLast().distance + " minuten \n");
                break;
            case "auto":
                System.out.println("De auto rit was " + path.getLast().distance + " kilometer \n");
                break;
        }
    }

    private Edge addLane(String laneId, int sourceLocNo, int destLocNo, int duration, String type) {
        return new Edge(laneId, nodes.get(sourceLocNo), nodes.get(destLocNo), duration, type);
    }
}
