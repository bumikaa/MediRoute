package stringalgo;
public class KMP {
    public static int search(String text,String pattern){if(pattern.isEmpty())return 0;int[] lps=buildLPS(pattern);int i=0,j=0;while(i<text.length()){if(Character.toLowerCase(text.charAt(i))==Character.toLowerCase(pattern.charAt(j))){i++;j++;if(j==pattern.length())return i-j;}else if(j>0)j=lps[j-1];else i++;}return -1;}
    private static int[] buildLPS(String p){int[] l=new int[p.length()];for(int i=1,len=0;i<p.length();){if(Character.toLowerCase(p.charAt(i))==Character.toLowerCase(p.charAt(len)))l[i++]=++len;else if(len>0)len=l[len-1];else l[i++]=0;}return l;}
}
