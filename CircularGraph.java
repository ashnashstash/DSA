import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class CircularGraph {
  static boolean hasCycle(int node, int parent, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
    visited[node] = true;
    for (int neighbour : graph.get(node)) {
      if (!visited[neighbour]) {
        if (hasCycle(neighbour, node, graph, visited)) {
          return true;
        }
      } else if (neighbour != parent) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of vertices : ");
    int V = sc.nextInt();
    System.out.print("Enter number of edges : ");
    int E = sc.nextInt();
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < V; i++) {
      graph.add(new ArrayList<>());
    }
    System.out.println("Enter edges : ");
    for (int i = 0; i < E; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      graph.get(u).add(v);
      graph.get(v).add(u);
    }
    boolean[] visited = new boolean[V];
    boolean cycle = false;
    for (int i = 0; i < V; i++) {
      if (!visited[i]) {
        if (hasCycle(i, -1, graph, visited)) {
          cycle = true;
          break;
        }
      }
    }
    if (cycle) {
      System.out.println("Cycle exists");
    } else {
      System.out.println("No cycle");
    }
  }
}
