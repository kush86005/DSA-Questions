package Graphs;
import java.util.*;
public class Question10 {
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
        graph[src].add(new Edge(src,dest,wt));
        graph[dest].add(new Edge(dest,src,wt));
    }
    public static void dijkstra(ArrayList<Edge> graph[],int src){
        boolean[] visited=new boolean[graph.length];
        int[] dist=new int[graph.length];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        dist[src]=0;
        pq.add(new int[]{src,0});

        while(!pq.isEmpty()){
            int curr[]=pq.remove();
            int u=curr[0];

            if(visited[u]){
                continue;
            }else{
                visited[u]=true;
            }
            for(Edge edge:graph[u]){
                int v=edge.dest;
                int weight=edge.wt;

                //This is relaxation(updating the shortest known distance to a node if a shorter path to it is found through another node)
                if(dist[u]+weight<dist[v]){
                    dist[v]=dist[u]+weight;
                    pq.add(new int[]{v,dist[v]});
                }
            }
        }
        System.out.print("Shortest distance from node "+src+" is: ");
        for(int i=0;i<dist.length;i++){
            System.out.println("To node "+i+"= "+dist[i]);
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
            System.out.print("Enter source of edge:- ");
            int src=sc.nextInt();
            System.out.print("Enter destination of edge:- ");
            int dest=sc.nextInt();
            System.out.print("Enter weight of edge:- ");
            int wt=sc.nextInt();
            add(graph,src,dest,wt);
        }
        System.out.print("Enter starting node:- ");
        int start=sc.nextInt();

        dijkstra(graph,start);
    }
}
