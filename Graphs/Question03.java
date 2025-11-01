package Graphs;
import java.util.*;
public class Question03 {
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
    public static void BFS(ArrayList<Edge> graph[]){
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                queue.offer(i);
                visited[i]=true;
                System.out.print("BFS traversal begins from:- "+i+": ");

                while(!queue.isEmpty()){
                    int node=queue.poll();
                    System.out.print(node+" ");
                    for(Edge edge:graph[node]){
                        if(!visited[edge.dest]){
                            queue.offer(edge.dest);
                            visited[edge.dest]=true;
                        }
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of vertex:- ");
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();

        ArrayList<Edge> graph[]=new ArrayList[v];
        create(graph);

        System.out.print("Enter number of edge:- ");
        int e=sc.nextInt();
        for(int i=0;i<e;i++){
            System.out.print("Enter source vertex:- ");
            int src=sc.nextInt();
            System.out.print("Enter destination vertex:- ");
            int dest=sc.nextInt();
            add(graph,src,dest);
        }
        BFS(graph);
    }
}
