package graph.trail;

import graph.MyGraph;

public class DepthFirstSearch<Vertex> extends Search<Vertex> {
    public DepthFirstSearch(MyGraph<Vertex> graph, Vertex start) {
        super(graph, start);
    }
}
