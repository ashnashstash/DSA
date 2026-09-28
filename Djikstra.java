import java.util.Arrays;

public class Djikstra {
  static int minDistance(int[] dist, boolean[] visited) {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;
    for (int i = 0; i < dist.length; i++) {
      if (!visited[i] && dist[i] <= min) {
        min = dist[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

  public class Dijkstra {
    static void dijkstra(int[][] graph, int source) {
      int n = graph.length;
      int[] dist = new int[n];
      boolean[] visited = new boolean[n];
      Arrays.fill(dist, Integer.MAX_VALUE);
      dist[source] = 0;
      for (int count = 0; count < n - 1; count++) {
        int current = minDistance(dist, visited);
        visited[current] = true;
        for (int neighbour = 0; neighbour < n; neighbour++) {
          if (!visited[neighbour] &&
              graph[current][neighbour] != 0 &&
              dist[current] != Integer.MAX_VALUE &&
              dist[current] + graph[current][neighbour] < dist[neighbour]) {

            dist[neighbour] = dist[current] + graph[current][neighbour];
          }
        }
      }
      System.out.println("Shortest distances from " + source + ":");
      for (int i = 0; i < n; i++) {
        System.out.println(source + " -> " + i + " : " + dist[i]);
      }
    }

    public static void main(String[] args) {
      int[][] graph = {
          { 0, 4, 3, 0 },
          { 4, 0, 0, 2 },
          { 3, 0, 0, 3 },
          { 0, 2, 3, 0 }
      };

      dijkstra(graph, 0);
    }
  }
}

/*
 * 
 * relaxation path
 * minimum path
 * 
 */