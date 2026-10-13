package graph;
import java.util.*;
public class FordFulkerson { public static int maxFlow(int[][] cap,int s,int t){int n=cap.length,flow=0;while(true){int[] p=new int[n];Arrays.fill(p,-1);p[s]=-2;int[] path=new int[n];Queue<Integer> q=new ArrayDeque<>();q.add(s);while(!q.isEmpty()&&p[t]==-1){int u=q.poll();for(int v=0;v<n;v++)if(p[v]==-1&&cap[u][v]>0){p[v]=u;path[v]=Math.min(u==s?Integer.MAX_VALUE:path[u],cap[u][v]);q.add(v);if(v==t)break;}}if(p[t]==-1)break;int add=path[t];flow+=add;for(int v=t;v!=s;v=p[v]){int u=p[v];cap[u][v]-=add;cap[v][u]+=add;}}return flow;} }
