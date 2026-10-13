package services;
import graph.*;import java.util.*;
public class DeliveryService { public static void shortestRoute(){Graph g=new Graph(6);g.addUndirectedEdge(0,1,5);g.addUndirectedEdge(0,2,10);g.addUndirectedEdge(1,2,3);g.addUndirectedEdge(1,3,4);g.addUndirectedEdge(2,4,2);g.addUndirectedEdge(3,5,6);g.addUndirectedEdge(4,5,3);int[] d=Dijkstra.shortestPaths(g,0);System.out.println("\nShortest distances from Central Warehouse (node 0): "+Arrays.toString(d));System.out.println("Example route to hospital node 5 has distance "+d[5]+" km.");} }
