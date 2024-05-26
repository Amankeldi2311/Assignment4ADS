package graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph<Vertex> extends MyGraph<Vertex> {
    private final boolean directed;
    private final Map<Vertex, List<Edge<Vertex>>> graph = new HashMap<>();

    public WeightedGraph() {
        directed = true;
    }

    public WeightedGraph(boolean directed) {
        this.directed = directed;
    }
    public void addEdge(Vertex src, Vertex dest, double weight) {
        if (src.equals(dest)) return; // no self-loops
        graph.computeIfAbsent(src, k -> List.of());
        graph.computeIfAbsent(dest, k -> List.of());
        graph.get(src).add(new Edge<>(src, dest, weight));
        if (!directed) {
            graph.get(dest).add(new Edge<>(dest, src, weight));
        }
    }


}
