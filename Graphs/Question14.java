package Graphs;
import java.util.*;
public class Question14 {
   static class disjoint{
        int[] parent;
        int[] size;

        disjoint(int nodes){
            parent=new int[nodes];
            size=new int[nodes];

            for(int i=0;i<nodes;i++){
                parent[i]=i;
                size[i]=1;
            }
        }

        int path(int node){
            if(node==parent[node]){
                return node;
            }
            parent[node]=path(parent[node]);
            return parent[node];
        }
        void union(int node1,int node2){
            int parentU=path(node1);
            int parentV=path(node2);

            if(parentU==parentV)return;

            if(size[parentU]>size[parentV]){
                parent[parentV]=parentU;
                size[parentU]+=size[parentV];
            }else{
                parent[parentU]=parentV;
                size[parentV]+=size[parentU];
            }
        }
    }

    public static void main(String[] args) {
        disjoint ds=new disjoint(5);

        ds.union(0, 1);
        ds.union(1, 2);
        ds.union(3, 4);

        System.out.println("Parent of 2: " + ds.path(2));
        System.out.println("Parent of 1: " + ds.path(1));
        System.out.println("Parent of 4: " + ds.path(4));
    }
}
