package Summatieve_opdracht_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DijkstraAlgorithm {
    private final List<Stap> nodes;
    private final List<Edge> edges;
    private Set<Stap> settledNodes;
    private Set<Stap> unSettledNodes;
    private Map<Stap, Stap> predecessors;
    private Map<Stap, Integer> distance;

    public DijkstraAlgorithm(Graph graph) {
        // create a copy of the array so that we can operate on this array
        this.nodes = new ArrayList<Stap>(graph.getStappen());
        this.edges = new ArrayList<Edge>(graph.getEdges());
    }

    public void execute(Stap source) {
        settledNodes = new HashSet<Stap>();
        unSettledNodes = new HashSet<Stap>();
        distance = new HashMap<Stap, Integer>();
        predecessors = new HashMap<Stap, Stap>();
        distance.put(source, 0);
        unSettledNodes.add(source);
        while (unSettledNodes.size() > 0) {
            Stap node = getMinimum(unSettledNodes);
            settledNodes.add(node);
            unSettledNodes.remove(node);
            findMinimalDistances(node);
        }
    }

    private void findMinimalDistances(Stap node) {
        List<Stap> adjacentNodes = getNeighbors(node);
        for (Stap target : adjacentNodes) {
            if (getShortestDistance(target) > getShortestDistance(node)
                    + getDistance(node, target)) {
                distance.put(target, getShortestDistance(node)
                        + getDistance(node, target));
                predecessors.put(target, node);
                unSettledNodes.add(target);
            }
        }

    }

    private int getDistance(Stap node, Stap target) {
        for (Edge edge : edges) {
            if (edge.getVertrek().equals(node)
                    && edge.getBestemming().equals(target)) {
                return edge.getKosten();
            }
        }
        throw new RuntimeException("Should not happen");
    }

    private List<Stap> getNeighbors(Stap node) {
        List<Stap> neighbors = new ArrayList<Stap>();
        for (Edge edge : edges) {
            if (edge.getVertrek().equals(node)
                    && !isSettled(edge.getBestemming())) {
                neighbors.add(edge.getBestemming());
            }
        }
        return neighbors;
    }

    private Stap getMinimum(Set<Stap> Stapes) {
        Stap minimum = null;
        for (Stap Stap : Stapes) {
            if (minimum == null) {
                minimum = Stap;
            } else {
                if (getShortestDistance(Stap) < getShortestDistance(minimum)) {
                    minimum = Stap;
                }
            }
        }
        return minimum;
    }

    private boolean isSettled(Stap Stap) {
        return settledNodes.contains(Stap);
    }

    private int getShortestDistance(Stap destination) {
        Integer d = distance.get(destination);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }

    /*
     * This method returns the path from the source to the selected target and
     * NULL if no path exists
     */
    public LinkedList<Stap> getPath(Stap target) {
        LinkedList<Stap> path = new LinkedList<Stap>();
        Stap step = target;
        // check if a path exists
        if (predecessors.get(step) == null) {
            return null;
        }
        path.add(step);
        while (predecessors.get(step) != null) {
            step = predecessors.get(step);
            path.add(step);
        }
        // Put it into the correct order
        Collections.reverse(path);
        return path;
    }

}