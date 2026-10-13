package approximation;
import java.util.*;
public class VertexCover { public static Set<Integer> approximate(int n,int[][] edges){Set<Integer> cover=new LinkedHashSet<>();boolean[] used=new boolean[n];for(int[] e:edges){if(!used[e[0]]&&!used[e[1]]){used[e[0]]=used[e[1]]=true;cover.add(e[0]);cover.add(e[1]);}}return cover;} }
