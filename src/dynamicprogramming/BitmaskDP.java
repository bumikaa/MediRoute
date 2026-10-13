package dynamicprogramming;
public class BitmaskDP { public static int minCost(int[][] cost){int n=cost.length,N=1<<n,INF=1_000_000_000;int[] dp=new int[N];java.util.Arrays.fill(dp,INF);dp[0]=0;for(int mask=0;mask<N;mask++){int i=Integer.bitCount(mask);if(i>=n)continue;for(int j=0;j<n;j++)if((mask&(1<<j))==0)dp[mask|1<<j]=Math.min(dp[mask|1<<j],dp[mask]+cost[i][j]);}return dp[N-1];} }
