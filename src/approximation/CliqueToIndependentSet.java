package approximation;

public class CliqueToIndependentSet {
    public static boolean[][] complement(boolean[][] g) {
        int n=g.length; boolean[][] c=new boolean[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) if(i!=j) c[i][j]=!g[i][j];
        return c;
    }
}
