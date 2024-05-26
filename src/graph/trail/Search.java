package graph.trail;

import graph.MyGraph;

public class Search<Vertex> {
    private MyGraph<Vertex> graph;
    private Vertex start;

    public Search(MyGraph<Vertex> graph, Vertex start) {
        this.graph = graph;
        this.start = start;
    }
    public Iterable<Vertex> pathTo(Vertex dest) {
        return null;
    }

}
