package driver;

import graphs.MyGraph;

import java.util.List;

public class TestGraph {
    public static void main(String[] args) {
        //firstGraphTest();

        MyGraph<Character> charGraph = new MyGraph<>();
        charGraph.addVertex('A','B','C','D','E','F');
        charGraph.addEdge('A','B', 1);
        charGraph.addEdge('B','C', 1);
        charGraph.addEdge('C','D', 1);
        charGraph.addEdge('C','E', 1);
        charGraph.addEdge('C','F', 1);
        charGraph.addEdge('E','F', 1);

        charGraph.removeEdge('A', 'B');

        List<Character> traversal = charGraph.bfs('C');
        System.out.println(traversal);
    }

    private static void firstGraphTest() {
        String[] strings = {"a","b","c","d","e","f"};
        MyGraph<String> stringGraph = new MyGraph<>();
        boolean allAdded = stringGraph.addVertex(strings);
        System.out.println("All vertices added? " + allAdded);

        //search for vertices
        for(String test : strings){
            System.out.println("Contains Vertex(" + test + ") = " +
                    stringGraph.containsVertex(test));
        }

        stringGraph.addEdge("a","b", 1);
        stringGraph.addEdge("a","c", 1);
        stringGraph.addEdge("a","e", 1);

        //test for edges that should be there
        System.out.println(stringGraph.containsEdge("a","b"));
        System.out.println(stringGraph.containsEdge("a","c"));
        System.out.println(stringGraph.containsEdge("a","e"));
        System.out.println(stringGraph.containsEdge("a","f"));
        System.out.println(stringGraph.containsEdge("a","g"));

        System.out.println("|V|: " + stringGraph.vertexSize());
        System.out.println("|E|: " + stringGraph.edgeSize());

        System.out.println(stringGraph.vertices());
        System.out.println(stringGraph.edges());
    }
}
