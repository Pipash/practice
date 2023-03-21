import java.util.ArrayList;

public class BFSAlgo {
    boolean[] visited;
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(4);
    public BFSAlgo() {
        this.visited = new boolean[4];
        for (int i = 0; i < 4; i++) {
            this.adjList.add(new ArrayList<>());
        }
        this.addEdge(0, 1);
        this.addEdge(0, 2);
        this.addEdge(1, 2);
        this.addEdge(2, 0);
        this.addEdge(2, 3);
        this.addEdge(3, 3);
        //System.out.println(this.adjList);
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        this.bfs(2);

    }

    public void addEdge(int src, int dst) {
        this.adjList.get(src).add(dst);
    }

    public void bfs(int vertex) {
        this.visited[vertex] = true;
        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(vertex);
        System.out.println(queue);
        while (queue.size() != 0) {
            vertex = queue.get(0);
            System.out.print(vertex+" ");
            queue.remove(0);
            for (int adj : adjList.get(vertex)) {
                if (!this.visited[vertex]) {
                    this.visited[vertex] = true;
                    queue.add(adj);
                }
            }
        }
    }
}
