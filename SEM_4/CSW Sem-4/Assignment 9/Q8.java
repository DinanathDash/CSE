import java.util.*;

class GraphMatrix {
    private int[][] adjMatrix;
    private int numVertices;

    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    public void displayMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class GraphList {
    private LinkedList<Integer>[] adjList;
    private int numVertices;

    public GraphList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        adjList[i].add(j);
        adjList[j].add(i);
    }

    public void removeEdge(int i, int j) {
        adjList[i].remove((Integer) j);
        adjList[j].remove((Integer) i);
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
}

public class Q8 {
    public static void main(String[] args) {
        int numVertices = 5;

        GraphMatrix graphMatrix = new GraphMatrix(numVertices);
        graphMatrix.addEdge(0, 1);
        graphMatrix.addEdge(0, 4);
        graphMatrix.addEdge(1, 2);
        graphMatrix.addEdge(1, 3);
        graphMatrix.addEdge(1, 4);
        graphMatrix.addEdge(2, 3);
        graphMatrix.addEdge(3, 4);
        graphMatrix.displayMatrix();

        GraphList graphList = new GraphList(numVertices);
        graphList.addEdge(0, 1);
        graphList.addEdge(0, 4);
        graphList.addEdge(1, 2);
        graphList.addEdge(1, 3);
        graphList.addEdge(1, 4);
        graphList.addEdge(2, 3);
        graphList.addEdge(3, 4);
        graphList.displayList();
    }
}
