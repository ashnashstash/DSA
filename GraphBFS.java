import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class GraphBFS {

  static void BFS(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visited[start] = true;
    while (!queue.isEmpty()) {
      int node = queue.poll();  //removes the front element from the queue
      System.out.print(node + " ");
      for (int neighbour : graph.get(node)) {
        if (!visited[neighbour]) {
          visited[neighbour] = true;
          queue.add(neighbour);
        }
      }
    }
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
    System.out.print("BFS : ");
    BFS(0, graph, visited);
  }
}

/*
 * 
 * uses queue
 * 
 */
