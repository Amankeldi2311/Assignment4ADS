package graph.trail;

import graph.MyGraph;
import graph.WeightedGraph;

public class DijkstraSearch<Vertex> extends Search<Vertex> {
    private WeightedGraph<Vertex> graph;


    public DijkstraSearch(WeightedGraph<Vertex> graph, Vertex start) {
        super(graph, start);
        this.graph = graph;
    }

}
