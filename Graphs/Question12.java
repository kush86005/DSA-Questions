package Graphs;
import java.util.*;
public class Question12 {
    /* 🧠 Prim’s Algorithm (Easy Explanation)

🔹 What It Does
Finds the Minimum Spanning Tree (MST) of a connected, weighted, undirected graph.
It connects all vertices with the minimum total edge weight and no cycles.

🔹 When to Use
Use Prim’s algorithm when:

The graph is dense (many edges).

The graph is given as an adjacency list or matrix.

You want to grow the MST starting from one vertex.
If the graph is sparse or edges are already sorted, Kruskal’s algorithm might be better.

🔹 Main Idea
Prim’s uses a greedy approach — always pick the smallest edge that connects a visited vertex to an unvisited one.
It uses a min-heap (priority queue) to efficiently get the smallest edge and a visited set to avoid cycles.

🔹 Steps

Start from any vertex.

Add all edges from this vertex to a min-heap.

Pick the smallest edge that connects to a new vertex.

Mark that vertex as visited and add its edges to the heap.

Repeat until all vertices are included in the MST.

🔹 Complexities

Time Complexity: O(E log V) using a min-heap and adjacency list.

Space Complexity: O(V + E).
Efficient for dense graphs.

🔹 Important Notes

Works only on connected, undirected, weighted graphs.

Always produces the minimum total cost tree.

Similar to Dijkstra’s algorithm, but focuses on tree weight, not shortest distance.

Ensures no cycles are formed while connecting all vertices. */

}
