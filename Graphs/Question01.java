package Graphs;
import java.util.*;
public class Question01 {
    static class Edge{
        int src;
        int dest;

        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
    }
    public static void add(ArrayList<Edge> graph[],int src,int dest){
        graph[src].add(new Edge(src,dest));
        graph[dest].add(new Edge(dest,src));
    }
    public static void display(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            System.out.print("Vertex "+i+" ->");
            for(Edge edge:graph[i]){
                System.out.print(edge.dest+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number of vertex:- ");
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        System.out.print("Enter number of edges:- ");
        int e=sc.nextInt();

        for(int i=0;i<e;i++){
            System.out.print("Enter source vertes:- "+(i+1)+": ");
            int src=sc.nextInt();
            System.out.print("Enter destination vertex:- "+(i+1)+": ");
            int dest=sc.nextInt();
            add(graph,src,dest);
        }
        display(graph);
    }
}
