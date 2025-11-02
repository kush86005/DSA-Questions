package Graphs;
import java.util.*;
public class Question08 {
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
    public static void topological(ArrayList<Edge> graph[], boolean[] visited,Stack<Integer> stack,int curr){
        visited[curr]=true;

        for(Edge edge:graph[curr]){
            if(!visited[edge.dest]){
                topological(graph,visited,stack,edge.dest);
            }
        }
        stack.push(curr);
    }
    public static void topodisconnected(ArrayList<Edge> graph[]){
        boolean[] visited=new boolean[graph.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                topological(graph,visited,stack,i);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
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
            System.out.print("Enter src for edge:- ");
            int src=sc.nextInt();

            System.out.print("Enter dest for edge:- ");
            int dest=sc.nextInt();
            add(graph,src,dest);
        }
        topodisconnected(graph);
    }
}
