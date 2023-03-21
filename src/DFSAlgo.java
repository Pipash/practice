import java.util.ArrayList;

public class DFSAlgo {
    //private boolean[] visited;
    private ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    public DFSAlgo() {
        //visited = new boolean[4];
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<Integer>());
        }

        this.addEdge(0, 1);
        this.addEdge(1, 2);
        this.addEdge(2, 3);
        this.addEdge(1, 3);
        this.addEdge(0, 3);


        boolean[] visited = new boolean[4];
        boolean[] recStack = new boolean[4];


        // Call the recursive helper function to
        // detect cycle in different DFS trees
        boolean result = false;
        for (int i = 0; i < 4; i++)
            if (dfs(i, visited, recStack))
                result= true;

        if(result) {
            System.out.println("cyclic");
        } else {
            System.out.println("not Cyclic");
        }
    }

    public void addEdge(int src, int dst) {
        this.adj.get(src).add(dst);
    }

    public boolean dfs(int vertex, boolean[] visited, boolean[] recStack) {
        if (recStack[vertex]) {
            return true;
        }
        if (visited[vertex]) {
            return false;
        }
        visited[vertex] = true;
        recStack[vertex] = true;

        for (Integer ad : this.adj.get(vertex)){
            if (dfs(ad, visited, recStack)) {
                return true;
            }
        }

        recStack[vertex] = false;
        return false;
    }
}
