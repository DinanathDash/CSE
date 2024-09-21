import java.util.*;

class Graph {
    private LinkedList<Integer>[] adjList;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adj : adjList[vertex]) {
            if (!visited[adj]) {
                DFSUtil(adj, visited);
            }
        }
    }

    public void displayList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ": ");
            for (int j : adjList[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.displayList();

        System.out.println("DFS traversal starting from vertex 0:");
        graph.DFS(0);
    }
}
