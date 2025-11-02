package Graphs;
import java.util.*;
public class Question09 {
    static class Edge{
        int src;
        int dest;

        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
    }
    public static void add(ArrayList<Edge> graph[],int src,int dest){
        graph[src].add(new Edge(src,dest));
        graph[dest].add(new Edge(dest,src));
    }
    public static boolean cycledetection(ArrayList<Edge> graph[],boolean[] visited,int curr,int parent){
        visited[curr]=true;
        for(Edge edge:graph[curr]){
            if(visited[edge.dest]&&parent!=edge.dest){
                return true;
            }else if(!visited[edge.dest]){
                if(cycledetection(graph,visited,edge.dest,curr)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void cycle(ArrayList<Edge> graph[]){
        boolean[] visited=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                if(cycledetection(graph,visited,i,-1)){
                    System.out.print("Cycle detected");
                    return;
                }
            }
        }
        System.out.print("No cycle detected");
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
            System.out.print("Enter source node for edge:- ");
            int src=sc.nextInt();

            System.out.print("Enter destination node for edge:- ");
            int dest=sc.nextInt();

            add(graph,src,dest);
        }
        cycle(graph);
    }
}
