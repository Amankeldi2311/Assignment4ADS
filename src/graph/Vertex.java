package graph;

public class Vertex<O> {
    private final O value;

    public Vertex(O value) {
        this.value = value;
    }

    public O getValue() {
        return value;
    }
}
