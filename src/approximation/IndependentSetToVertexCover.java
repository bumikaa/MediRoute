package approximation;

public class IndependentSetToVertexCover {
    public static boolean[] complement(boolean[] independentSet) {
        boolean[] cover=new boolean[independentSet.length];
        for(int i=0;i<cover.length;i++) cover[i]=!independentSet[i];
        return cover;
    }
}
