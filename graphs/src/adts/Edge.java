package adts;

public class Edge<V>{
    private V source;
    private V destination;
    private int weight;

    public Edge(V source, V destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public V getSource() {
        return source;
    }

    public V getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return source + "<-" + weight + "->" + destination;
    }
}
