package Graphs;
import java.util.*;
public class Question15 {
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
    static public int[] parent;
    static public int[] rank;

    public static int find(int node){
        if(parent[node]==node){
            return node;
        }
        parent[node]=find(parent[node]);
        return parent[node];
    }
    public static void union(int node1,int node2){
        int parentU=find(node1);
        int parentV=find(node2);

        if(parentU==parentV){
            return;
        }
        if(rank[parentU]>rank[parentV]){
            parent[parentV]=parentU;
        }else if(rank[parentV]>rank[parentU]){
            parent[parentU]=parentV;
        }else{
            parent[parentU]=parentV;
            rank[parentV]++;
        }
    }
    public static void kruskal(ArrayList<Edge> graph[]){
        PriorityQueue<Edge> pq=new PriorityQueue<>(Comparator.comparingInt(a->a.wt));

        for(int i=0;i<graph.length;i++){
            for(Edge edge:graph[i]){
                pq.add(edge);
            }
        }
        parent=new int[graph.length];
        rank=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            parent[i]=i;
            rank[i]=0;
        }
        ArrayList<Edge> mst=new ArrayList<>();
        while(!pq.isEmpty()){
            Edge edge=pq.poll();
            int u=edge.src;
            int v=edge.dest;

            if(find(u)!=find(v)){
                union(u,v);
                mst.add(edge);
            }
        }

        System.out.println("Edges in the MST:");
        for (Edge e : mst) {
            System.out.println("Source: " + e.src + ", Destination: " + e.dest + ", Weight: " + e.wt);
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
    }
    public static void add(ArrayList<Edge> graph[],int src,int dest,int wt){
        graph[src].add(new Edge(src,dest,wt));
        graph[dest].add(new Edge(dest,src,wt));
    }

    public static void main(String[] args) {
        System.out.print("Enter number of vertices:- ");
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();

        ArrayList<Edge> graph[]=new ArrayList[v];
        create(graph);

        System.out.print("Enter number of edges:- ");
        int e=sc.nextInt();
        for(int i=0;i<e;i++){
            System.out.print("Enter source of edge:- ");
            int src=sc.nextInt();

            System.out.print("Enter destination of edge:- ");
            int dest=sc.nextInt();

            System.out.print("Enter weight of edge:- ");
            int wt=sc.nextInt();

            add(graph,src,dest,wt);
        }
        kruskal(graph);
    }
}
