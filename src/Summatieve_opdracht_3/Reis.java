package Summatieve_opdracht_3;

import java.util.ArrayList;
import java.util.List;

public class Reis {
    private List<Stap> stappen;
    private List<Edge> edges;

    public void Reis() {
        stappen = new ArrayList<Stap>();
        edges = new ArrayList<Edge>();

        stappen.add(new Stap("Amsterdam", "Node_1"));
        stappen.add(new Stap("Groningen", "Node_2"));
        stappen.add(new Stap("Zwolle", "Node_3"));
        stappen.add(new Stap("Utrecht", "Node_4"));
        stappen.add(new Stap("Rotterdam", "Node_5"));
        stappen.add(new Stap("Maastricht", "Node_6"));
        stappen.add(new Stap("Den Haag", "Node_7"));
        stappen.add(new Stap("Nijmegen", "Node_8"));

        addLane("Edge_0", 0, 1, 85);
        addLane("Edge_1", 0, 2, 217);
        addLane("Edge_2", 0, 4, 173);
        addLane("Edge_3", 2, 6, 186);
        addLane("Edge_4", 2, 7, 103);
        addLane("Edge_5", 3, 7, 183);
        addLane("Edge_6", 5, 8, 250);
        addLane("Edge_7", 8, 2, 84);
        addLane("Edge_8", 7, 3, 167);
        addLane("Edge_9", 4, 8, 502);
        addLane("Edge_10", 7, 8, 40);
        addLane("Edge_11", 1, 5, 600);
    }


    private void addLane(String laneId, int sourceLocNo, int destLocNo,
                         int duration) {
        Edge lane = new Edge(laneId, stappen.get(sourceLocNo), stappen.get(destLocNo), duration);
        edges.add(lane);
    }
}