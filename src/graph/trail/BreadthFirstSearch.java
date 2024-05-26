package graph.trail;

import graph.MyGraph;

public class BreadthFirstSearch<Vertex> extends Search<Vertex> {
    public BreadthFirstSearch(MyGraph<Vertex> graph, Vertex start) {
        super(graph, start);
    }

}
