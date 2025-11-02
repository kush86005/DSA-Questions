package Graphs;
import java.util.*;
public class Question11 {
    /* 🧠 Bellman–Ford Algorithm (Easy Explanation)
🔹 What It Does

Finds shortest paths from one source to all other vertices.

Works on weighted directed graphs.

Can handle negative edge weights.

Can detect negative weight cycles.

🔹 When to Use

Use Bellman–Ford when:

The graph has negative weights.

You need to check for negative cycles.

If all weights are non-negative, use Dijkstra’s algorithm instead (it’s faster).

🔹 Main Idea

It uses edge relaxation:

For every edge (u → v) with weight w:
if dist[u] + w < dist[v], then update dist[v] = dist[u] + w.

This is done (V − 1) times (where V = number of vertices).

Because the shortest path in a graph can have at most V − 1 edges.

🔹 Steps

Initialize all distances as infinity (∞) and dist[source] = 0.

Repeat (V − 1) times:

For every edge (u, v, w), relax it.

Check for negative cycles:

Do one more pass through all edges.

If any distance still changes → there’s a negative weight cycle.

🔹 Complexities

Time complexity: O(V × E)

Space complexity: O(V)

Slower than Dijkstra but works with negative weights.

🔹 Important Notes

Works with: Directed, weighted graphs.

Can handle: Negative edges.

Can detect: Negative weight cycles.

Cannot use: Priority queue (like Dijkstra), because distances can change multiple times.

Cannot find valid shortest paths if a negative cycle is reachable from the source (distances keep decreasing).

🔹 Why (V − 1) Times?

A shortest path can have at most V − 1 edges.

After that, if distances still change, a negative cycle must exist. */

}