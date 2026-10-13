package graph;
import java.util.*;
public class Dijkstra { public static int[] shortestPaths(Graph g,int s){int[] d=new int[g.size()];Arrays.fill(d,Integer.MAX_VALUE);d[s]=0;PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));pq.add(new int[]{s,0});while(!pq.isEmpty()){int[] cur=pq.poll();int u=cur[0];if(cur[1]!=d[u])continue;for(Edge e:g.edges(u))if(d[u]!=Integer.MAX_VALUE&&d[e.to]>d[u]+e.weight){d[e.to]=d[u]+e.weight;pq.add(new int[]{e.to,d[e.to]});}}return d;} }
