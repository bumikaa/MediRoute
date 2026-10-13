package graph;

import java.util.*;

public class EdmondsKarp {
    public static int maxFlow(int[][] original,int source,int sink){
        int[][] r=new int[original.length][];for(int i=0;i<original.length;i++)r[i]=original[i].clone();
        int flow=0,n=r.length;
        while(true){
            int[] parent=new int[n];Arrays.fill(parent,-1);parent[source]=-2;
            int[] bottleneck=new int[n];bottleneck[source]=Integer.MAX_VALUE;
            Queue<Integer> q=new ArrayDeque<>();q.add(source);
            while(!q.isEmpty()&&parent[sink]==-1){
                int u=q.poll();
                for(int v=0;v<n;v++) if(parent[v]==-1&&r[u][v]>0){
                    parent[v]=u;bottleneck[v]=Math.min(bottleneck[u],r[u][v]);q.add(v);
                    if(v==sink)break;
                }
            }
            if(parent[sink]==-1)break;
            int add=bottleneck[sink];flow+=add;
            for(int v=sink;v!=source;v=parent[v]){int u=parent[v];r[u][v]-=add;r[v][u]+=add;}
        }
        return flow;
    }
}
