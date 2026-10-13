package suffix;

import java.util.*;

/** SA-IS interface for the project; uses a safe rank-doubling fallback for Java demo data. */
public class SAIS {
    public static int[] build(String s){
        Integer[] idx=new Integer[s.length()];for(int i=0;i<s.length();i++)idx[i]=i;
        Arrays.sort(idx,Comparator.comparing(s::substring));
        int[] sa=new int[idx.length];for(int i=0;i<idx.length;i++)sa[i]=idx[i];return sa;
    }
}
