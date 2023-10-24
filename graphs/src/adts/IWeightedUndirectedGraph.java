package adts;

import java.util.List;
import java.util.Set;

/**
 * This represents a weighted undirected graph.
 * @param <V> this is the typeof vertices
 */
public interface IWeightedUndirectedGraph<V> {
    //basic methods
    boolean addVertex(V element);
    boolean addVertex(V... elements);
    boolean addEdge(V first, V second, int weight);
    boolean containsVertex(V search);
    boolean containsEdge(V first, V second);
    boolean removeVertex(V vertex);
    boolean removeEdge(V first, V second);
    Set<V> vertices();
    Set<Edge<V>> edges();
    int vertexSize();
    int edgeSize();

    //algorithms
    int degree(V vertex);

    //traversal algorithms
    List<V> dfs(V source);
    List<V> bfs(V source);
}
