import java.util.*;

class GraphDFS {
    private ArrayList<ArrayList<Integer>> adjLists;
    private boolean[] visited;

    // Graph creation
    GraphDFS(int vertices) {
        adjLists = new ArrayList<ArrayList<Integer>>(vertices);
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists.add(new ArrayList<Integer>());
    }

    // Add edges
    void addEdge(int src, int dest) {
        //adjLists[src].add(dest);
        adjLists.get(src).add(dest);
    }

    // DFS algorithm
    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adj : adjLists.get(vertex)) {
            if (!visited[adj])
                DFS(adj);
        }
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(4);

        g.addEdge(2, 0);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(0, 1);
        g.addEdge(3, 3);
        g.addEdge(1, 3);
        System.out.println(g.adjLists);

        System.out.println("Following is Depth First Traversal");

        g.DFS(2);
    }
}