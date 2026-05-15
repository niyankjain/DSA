import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class SimpleGraph {
  public static void main(String[] args) {
    Graph graph = new Graph(5);
    graph.addEdges(0,1);
    graph.addEdges(1,2);
    graph.addEdges(1,3);
    graph.addEdges(2,3);
    graph.addEdges(2,4);
    graph.printEdges();
  }
}

class Graph {
  int V;
  Map<Integer, List<Integer>> map;

  public Graph(int V) {
    this.V = V;
    map = new HashMap<>();
  }

  public void addEdges(Integer u, Integer v) {
    if(map.containsKey(u)) {
      map.get(u).add(v);
    } else {
      ArrayList<Integer> li1 = new ArrayList<>();
      li1.add(v);
      map.put(u, li1);
    }

    if(map.containsKey(v)) {
      map.get(v).add(u);
    } else {
      ArrayList<Integer> li1 = new ArrayList<>();
      li1.add(u);
      map.put(v, li1);
    }

  }

  public void printEdges() {
    for(Map.Entry<Integer, List<Integer>> entry :map.entrySet()) {
      System.out.print(entry.getKey()+": ");
      for(Integer nodes : entry.getValue()) {
        System.out.print(nodes+" ");
      }
      System.out.println();
    }
  }

  public void bfs() {
    boolean[] visitedNodesArray = new boolean[V];
    Arrays.fill(visitedNodesArray, false);
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);
    visitedNodesArray[0] = true;

    while(queue.size()> 0) {
      Integer u = queue.peek();
      queue.poll();
      List<Integer> neighbourList = map.get(u);
      for(Integer neighbour: neighbourList) {
        if(!visitedNodesArray[neighbour]) {
          visitedNodesArray[neighbour] = true;

        }
      }
    }
  }
}
