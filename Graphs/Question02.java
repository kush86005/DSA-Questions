package Graphs;
import java.util.*;
public class Question02 {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
    }
    public static void add(ArrayList<Edge> graph[],int src,int dest,int wt){
        for (Edge edge : graph[src]) {
            if (edge.dest == dest && edge.wt == wt) {
                System.out.println("Duplicate edge between " + src + " and " + dest + " with weight " + wt + ". Skipping.");
                return;
            }
        }
        graph[src].add(new Edge(src,dest,wt));
        graph[dest].add(new Edge(dest,src,wt));
    }
    public static void display(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            System.out.print("Vertex:- "+i+" ->");
            for(Edge edge:graph[i]){
                System.out.print(edge.dest+" ("+edge.wt+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of vertex:- ");
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        ArrayList<Edge> graph[]=new ArrayList[v];
        create(graph);

        System.out.print("Enter number of edges:- ");
        int e=sc.nextInt();
        for(int i=0;i<e;i++){
            System.out.print("Enter source vertex:- ");
            int src=sc.nextInt();
            System.out.print("Enter destination vertex:- ");
            int dest=sc.nextInt();
            System.out.print("Enter weight:- ");
            int wt=sc.nextInt();
            add(graph,src,dest,wt);
        }
        display(graph);
    }
}
