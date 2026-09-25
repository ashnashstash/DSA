import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
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
    System.out.print(graph);
  }
}

/*
 * 
 * graph-
 * vertices
 * edges-
 * directed
 * undirected
 * weighted
 * unweighted
 * 
 * adjacency matrix
 * can make graph using this
 * 
 */
