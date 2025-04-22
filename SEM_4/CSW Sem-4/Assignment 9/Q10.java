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
        adjList[dest].add(src); // For undirected graph
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.println("BFS traversal starting from vertex " + startVertex + ":");
        
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int adj : adjList[vertex]) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
        System.out.println();
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

        graph.BFS(0);
    }
}
