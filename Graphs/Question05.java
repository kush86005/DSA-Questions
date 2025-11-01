package Graphs;
import java.util.*;
public class Question05 {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void create(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
    }

    public static void add(ArrayList<Edge>[] graph, int src, int dest) {
        graph[src].add(new Edge(src, dest));
        graph[dest].add(new Edge(dest, src));
    }

    // Recursive function to print all paths from src to dest
    public static void printAllPathsDFS(ArrayList<Edge>[] graph, int curr, int dest,
                                        boolean[] visited, List<Integer> path) {
        visited[curr] = true;
        path.add(curr);

        if (curr == dest) {
            // Reached destination, print the path
            System.out.println(path);
            return;
        } else {
            // Explore neighbors
            for (Edge edge : graph[curr]) {
                if (!visited[edge.dest]) {
                    printAllPathsDFS(graph, edge.dest, dest, visited, path);
                }
            }
        }

        // Backtrack
        path.remove(path.size() - 1);
        visited[curr] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        for (int i = 0; i < e; i++) {
            System.out.print("Enter source vertex: ");
            int src = sc.nextInt();
            System.out.print("Enter destination vertex: ");
            int dest = sc.nextInt();
            add(graph, src, dest);
        }

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();
        System.out.print("Enter destination vertex: ");
        int destination = sc.nextInt();

        System.out.println("All paths from " + source + " to " + destination + ":");
        printAllPathsDFS(graph, source, destination, new boolean[v], new ArrayList<>());
    }
}
