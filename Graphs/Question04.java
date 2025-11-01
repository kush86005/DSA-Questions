package Graphs;
import java.util.*;
public class Question04 {
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
    public static void dfsrecursive(ArrayList<Edge> graph[],int curr,boolean[] visited){
        visited[curr]=true;
        System.out.print(curr+" ");

        for(Edge edge:graph[curr]){
            if(!visited[edge.dest]){
                dfsrecursive(graph,edge.dest,visited); //Recursive Call, Backtracking happens automatically when recursive call returns
            }
        }
    }
    public static void DFS(ArrayList<Edge> graph[]){
        boolean[] visited=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                System.out.print("DFS traversal begins "+i+": ");
                dfsrecursive(graph,i,visited);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices:- ");
        int v = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);

        System.out.print("Enter number of edges:- ");
        int e = sc.nextInt();

        for (int i = 0; i < e; i++) {
            System.out.print("Enter source vertex:- ");
            int src = sc.nextInt();
            System.out.print("Enter destination vertex:- ");
            int dest = sc.nextInt();
            add(graph, src, dest);
        }

        DFS(graph);
    }
}
