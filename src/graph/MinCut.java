package graph;
public class MinCut { public static int minCutValue(int[][] capacity,int s,int t){return FordFulkerson.maxFlow(copy(capacity),s,t);}private static int[][] copy(int[][] a){int[][] b=new int[a.length][];for(int i=0;i<a.length;i++)b[i]=a[i].clone();return b;} }
