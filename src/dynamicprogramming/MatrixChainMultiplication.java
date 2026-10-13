package dynamicprogramming;
public class MatrixChainMultiplication { public static long minMultiplications(int[] p){int n=p.length-1;long[][] dp=new long[n][n];for(int len=2;len<=n;len++)for(int i=0;i+len-1<n;i++){int j=i+len-1;dp[i][j]=Long.MAX_VALUE;for(int k=i;k<j;k++)dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k+1][j]+(long)p[i]*p[k+1]*p[j+1]);}return dp[0][n-1];} }
