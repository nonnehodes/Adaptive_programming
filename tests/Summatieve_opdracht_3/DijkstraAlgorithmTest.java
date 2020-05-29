package Summatieve_opdracht_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DijkstraAlgorithmTest {
    private List<Stap> nodes;
    private List<Edge> edges;

    @Test
    public void testExcute() {
        nodes = new ArrayList<Stap>();
        edges = new ArrayList<Edge>();
        String type = "vliegtuig";
        for (int i = 0; i < 11; i++) {
            Stap location = new Stap("Node_" + i, "Node_" + i);
            nodes.add(location);
        }

        addLane("Edge_0", 0, 1, 85, type);
        addLane("Edge_1", 0, 2, 217, type);
        addLane("Edge_2", 0, 4, 173, type);
        addLane("Edge_3", 2, 6, 186, type);
        addLane("Edge_4", 2, 7, 103, type);
        addLane("Edge_5", 3, 7, 183, type);
        addLane("Edge_6", 5, 8, 250, type);
        addLane("Edge_7", 8, 9, 84, type);
        addLane("Edge_8", 7, 9, 167, type);
        addLane("Edge_9", 4, 9, 502, type);
        addLane("Edge_10", 9, 10, 40, type);
        addLane("Edge_11", 1, 10, 600, type);

        // Lets check from location Loc_1 to Loc_10
        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Stap> path = dijkstra.getPath(nodes.get(10));

        assertNotNull(path);
        assertTrue(path.size() > 0);

        for (Stap Stap : path) {
            System.out.println(Stap);
        }

    }

    private void addLane(String laneId, int sourceLocNo, int destLocNo, int duration, String type) {
        Edge lane = new Edge(laneId, nodes.get(sourceLocNo), nodes.get(destLocNo), duration, type);
        edges.add(lane);
    }
}