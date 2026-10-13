package approximation;
public class Clique { public static boolean hasEdge(boolean[][] g,int u,int v){return g[u][v];} public static boolean isClique(boolean[][] g,int[] set){for(int i=0;i<set.length;i++)for(int j=i+1;j<set.length;j++)if(!g[set[i]][set[j]])return false;return true;} }
