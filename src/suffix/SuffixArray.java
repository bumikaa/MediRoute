package suffix;
import java.util.*;
public class SuffixArray { public static int[] build(String s){Integer[] a=new Integer[s.length()];for(int i=0;i<s.length();i++)a[i]=i;Arrays.sort(a,(i,j)->s.substring(i).compareTo(s.substring(j)));int[] r=new int[a.length];for(int i=0;i<a.length;i++)r[i]=a[i];return r;} }
