package Summatieve_opdracht_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {


    private static List<Stap> nodes;
    private static List<Edge> edges;

    public static void main(String[] args) {
        nodes = new ArrayList<Stap>();
        edges = new ArrayList<Edge>();
        for (int i = 0; i < 11; i++) {
            Stap location = new Stap("Node_" + i, "Node_" + i);
            nodes.add(location);
        }

        String type = "trein";

        addLane("Edge_0", 0, 1, 85, type);
        addLane("Edge_1", 0, 2, 150, type);
        addLane("Edge_2", 0, 4, 300, type);
        addLane("Edge_3", 2, 6, 186, type);
        addLane("Edge_4", 2, 7, 103, type);
        addLane("Edge_5", 3, 7, 183, type);
        addLane("Edge_6", 5, 8, 250, type);
        addLane("Edge_7", 8, 9, 84, type);
        addLane("Edge_8", 7, 9, 167, type);
        addLane("Edge_9", 4, 9, 150, type);
        addLane("Edge_10", 9, 10, 40, type);
        addLane("Edge_11", 1, 10, 250, type);
        addLane("Edge_12", 0, 3, 50, type);

        // Lets check from location Loc_1 to Loc_10
        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Stap> path = dijkstra.getPath(nodes.get(10));

        for (Stap stap : path) {
            System.out.println(stap.naam) ;
        }
        if (type.equals("vliegtuig")) {
            System.out.println("Vliegtuig reis kost: " + path.getLast().distance + " euro");
        } else if (type.equals("trein")) {
            System.out.println("De trein reis duurde "  + path.getLast().distance + " minuten");
        } else if (type.equals("auto")) {
            System.out.println("De auto rit was "  + path.getLast().distance + " kilometer");
        }

    }

    private static void addLane(String laneId, int sourceLocNo, int destLocNo, int duration, String type) {
        Edge lane = new Edge(laneId, nodes.get(sourceLocNo), nodes.get(destLocNo), duration, type);
        edges.add(lane);
    }
}


