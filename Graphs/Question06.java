package Graphs;
import java.util.*;
public class Question06 {
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
    }
    public static boolean cycledfs(ArrayList<Edge> graph[], boolean[] visited,boolean[] recursion,int curr){
        if (recursion[curr]) return true;
        if (visited[curr]) return false;

        recursion[curr]=true;
        visited[curr]=true;

        for(Edge edge:graph[curr]){
            if(cycledfs(graph,visited,recursion,edge.dest)){
                return true;
            }
        }
        recursion[curr]=false;
        return false;
    }
    //This function makes the code work to detect cycle in both connected and disconnected graph
    public static boolean iscyclic(ArrayList<Edge> graph[]){
        boolean[] visited=new boolean[graph.length];
        boolean[] recursion=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
               if(cycledfs(graph,visited,recursion,i)){
                   return true;
               }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of vertices:- ");
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        ArrayList<Edge>[] graph=new ArrayList[v];
        create(graph);

        System.out.print("Enter number of edges:- ");
        int e=sc.nextInt();
        for(int i=0;i<e;i++){
            System.out.print("Enter source:- ");
            int src=sc.nextInt();
            System.out.print("Enter destination:- ");
            int dest=sc.nextInt();
            add(graph,src,dest);
        }
        if(iscyclic(graph)){
            System.out.print("Cycle exists");
        }else{
            System.out.print("Cycle dosent exists");
        }
    }
}
