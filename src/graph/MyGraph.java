package graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph<Vertex> {
    private final boolean directed;
    private final Map<Vertex, List<Vertex>> graph = new HashMap<>();

    public MyGraph() {
        directed = true;
    }

    public MyGraph(boolean directed) {
        this.directed = directed;
    }
    public void addEdge(Vertex src, Vertex dest) {
        if (src.equals(dest)) return; // no self-loops
        graph.computeIfAbsent(src, k -> List.of());
        graph.computeIfAbsent(dest, k -> List.of());
        graph.get(src).add(dest);
        if (!directed) {
            graph.get(dest).add(src);
        }
    }
}
