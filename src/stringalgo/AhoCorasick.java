package stringalgo;
import java.util.*;
public class AhoCorasick {
    static class Node{int[] next=new int[128];int fail;List<String> out=new ArrayList<>();Node(){Arrays.fill(next,-1);}}
    private final List<Node> trie=new ArrayList<>(); public AhoCorasick(){trie.add(new Node());}
    public void add(String word){int v=0;for(char c:word.toLowerCase().toCharArray()){int x=c; if(x>=128)continue;if(trie.get(v).next[x]==-1){trie.get(v).next[x]=trie.size();trie.add(new Node());}v=trie.get(v).next[x];}trie.get(v).out.add(word);}
    public void build(){Queue<Integer> q=new ArrayDeque<>();for(int c=0;c<128;c++){int u=trie.get(0).next[c];if(u!=-1){trie.get(u).fail=0;q.add(u);}else trie.get(0).next[c]=0;}while(!q.isEmpty()){int v=q.poll();for(int c=0;c<128;c++){int u=trie.get(v).next[c];if(u!=-1){trie.get(u).fail=trie.get(trie.get(v).fail).next[c];trie.get(u).out.addAll(trie.get(trie.get(u).fail).out);q.add(u);}else trie.get(v).next[c]=trie.get(trie.get(v).fail).next[c];}}}
    public List<String> find(String text){List<String> found=new ArrayList<>();int v=0;for(char ch:text.toLowerCase().toCharArray()){if(ch>=128){v=0;continue;}v=trie.get(v).next[ch];found.addAll(trie.get(v).out);}return found;}
}
