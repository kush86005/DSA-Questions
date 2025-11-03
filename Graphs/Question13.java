package Graphs;
import java.util.*;
public class Question13 {
    static class disjoint {
        int[] parent;
        int[] rank;

        disjoint(int nodes) {
            parent = new int[nodes];
            rank = new int[nodes];

            for (int i = 0; i < nodes; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        /*This is Path compresion(While finding the root of a node, we make every node on the path point directly to that root
         — so future lookups become faster.) */
        int findparent(int node) {
            if (node == parent[node]) {
                return node;
            }
            parent[node] = findparent(parent[node]);
            return parent[node];
        }

        void unionrank(int node1, int node2) {
            int parentU = findparent(node1);
            int parentV = findparent(node2);

            if (parentU == parentV) {   //This means the parent of both nodes are same(Already union)
                return;
            }
            if (rank[parentU] > rank[parentV]) {
                parent[parentV] = parentU;
            } else if (rank[parentV] > rank[parentU]) {
                parent[parentU] = parentV;
            } else {
                parent[parentV] = parentU;
                rank[parentU]++; //Here we check if the tree is of same height. if yes, the height is incremented by 1.
                //This equal to case dosent mean that parent is same unlike the above if situation
            }
        }
    }
    public static void main(String[] args) {

        disjoint ds = new disjoint(5);
        ds.unionrank(0, 1);
        ds.unionrank(1, 2);
        ds.unionrank(3, 4);

        System.out.println("Parent of 2: " + ds.findparent(2));
        System.out.println("Parent of 1: " + ds.findparent(1));
        System.out.println("Parent of 4: " + ds.findparent(4));
    }
}
