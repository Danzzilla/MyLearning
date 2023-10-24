package graphs;

import adts.Edge;
import adts.IWeightedUndirectedGraph;
import org.w3c.dom.Node;

import java.util.*;

public class MyGraph<V> implements IWeightedUndirectedGraph<V> {

    private Map<V, Node> adjacencyLists = new HashMap<>();
    private int edgeCount;
    Set<Edge<V>> edgeSet = new HashSet<>();

    @Override
    public boolean addVertex(V element) {
        //the vertices are part of a set
        if(containsVertex(element)){
            return false;
        }

        //add it (the element and a null head reference in the LL
        adjacencyLists.put(element, null);
        return true;
    }

    @Override
    public boolean addVertex(V... elements) {
        //only return true if all the elements were added
        boolean result = true;
        for(V element : elements){
            boolean added = addVertex(element);
            result = result && added;
        }
        return result;
    }

    @Override
    public boolean addEdge(V first, V second, int weight) {
        //edges are part of a set(no duplicates))
        if(containsEdge(first, second)){
            return false;
        }

        //add the new edge at the start of both of the adjacency lists
        addDirectedEdge(first, second, weight);
        addDirectedEdge(second, first, weight);

        edgeSet.add(new Edge<V>(first, second, weight));
        edgeCount++;

        return true;
    }

    private void addDirectedEdge(V first, V second, int weight) {
        Node oldHead = adjacencyLists.get(first);
        if(oldHead == null){
            adjacencyLists.put(first, new Node(second, weight));
        }else{
            //put a new node at the start of the linked list
            adjacencyLists.put(first, new Node(second, weight, oldHead));
        }
    }

    @Override
    public boolean containsVertex(V search) {
        return adjacencyLists.containsKey(search);
    }

    @Override
    public boolean containsEdge(V first, V second) {
        //make sure the vertices are in the graph
        if(containsVertex(first) && containsVertex(second)) {
            //get the adjacency list of first
            Node current = adjacencyLists.get(first);

            //loop over the list and look for second in the list
            while(current != null){
                if(current.otherVertex.equals(second)){
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public boolean removeVertex(V vertex) {
        //check that vertex is in the graph
        if(containsVertex(vertex)) {
            //remove edges
            Node current = adjacencyLists.get(vertex);
            while(current != null){
                removeEdge(vertex, current.otherVertex);
                current = current.next;
            }
            //remove vertex and linked list
            adjacencyLists.remove(vertex, null);

            return true;
        }
        return false;
    }

    @Override
    public boolean removeEdge(V first, V second) {
        //double check that the vertices are in the graph
        if(containsEdge(first, second)) {
            removeDirectedEdge(first, second);
            removeDirectedEdge(second, first);

            //decrement the edge count
            edgeCount--;
            return true;
        }
        return false;
    }

    private void removeDirectedEdge(V first, V second){
        //get the adjacency list of first
        Node current = adjacencyLists.get(first);

        //remove "second" in adjacency list

        //if first node is the value "second"
        if(current == second){
            adjacencyLists.put(first, current.next);
        }else{
            while(current.next != null){
                //if node is in the middle or end of the list
                if (current.next == second) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }
    }

    @Override
    public Set<V> vertices() {
        return adjacencyLists.keySet();
    }

    @Override
    public Set<Edge<V>> edges() {
        return edgeSet;
    }

    @Override
    public int vertexSize() {
        //the same as the number of keys in the map
        return adjacencyLists.size();
    }

    @Override
    public int edgeSize() {
        return edgeCount;
    }

    @Override
    public int degree(V vertex) {
        return 0;
    }

    @Override
    public List<V> dfs(V source) {
        Set<V> allVerts = vertices();
        if(allVerts.isEmpty()){
            return new ArrayList<>();
        }

        List<V> traversalResults = new ArrayList<>();
        Set<V> visitedVerts = new HashSet<>();

        dfsRecursive(source, traversalResults, visitedVerts);

        return traversalResults;
    }

    //a list for our results - maintains the traveral order
    //a set for determining what we've seen already - fast!
    private void dfsRecursive(V current, List<V> traversal, Set<V> visited){
        //only traverse to this vertex if I haven't seen it before
        if(!visited.contains(current)){
            //mark that we have visited this vertex
            traversal.add(current);
            visited.add(current);

            //try to visit adjacent vertices
            Node neighbor = adjacencyLists.get(current);
            while(neighbor != null){
                //visit this neighbor
                dfsRecursive(neighbor.otherVertex, traversal, visited);
                //move on to the next neighbor
                neighbor = neighbor.next;
            }
        }
    }

    @Override
    public List<V> bfs(V source) {
        //create a few helper structures
        List<V> traversal = new ArrayList<>();
        Set<V> visited = new HashSet<>();
        Queue<V> bfsQueue = new LinkedList<>();

        //preform BFS
        bfsQueue.add(source);
        int size = vertexSize();
        while(traversal.size() < size){
            V next = bfsQueue.remove();

            if(!visited.contains(next)){
                //visited the vertex
                visited.add(next);
                traversal.add(next);

                //add the neighbors to the queue
                Node neighbor = adjacencyLists.get(next);

                while (neighbor != null){
                    if(!visited.contains(neighbor.otherVertex)) {
                        bfsQueue.add(neighbor.otherVertex);
                    }
                    neighbor = neighbor.next;
                }
            }
        }

        return traversal;
    }

    //inner classes
    private class Node{
        //data in the node
        private V otherVertex;
        private int weight;

        //next node
        private Node next;

        public Node(V otherVertex, int weight){
            this.otherVertex = otherVertex;
            this.weight = weight;
        }

        public Node(V otherVertex, int weight, Node next){
            this.otherVertex = otherVertex;
            this.weight = weight;
            this.next = next;
        }
    }
}
