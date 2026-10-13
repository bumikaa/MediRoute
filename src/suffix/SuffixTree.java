package suffix;

import java.util.*;

/** Compact educational suffix-tree/trie demonstration for small project data. */
public class SuffixTree {
    static class Node { Map<Character,Node> next=new HashMap<>(); boolean terminal; }
    private final Node root=new Node();
    public SuffixTree(String text){ for(int i=0;i<text.length();i++) insert(text.substring(i)); }
    private void insert(String s){Node cur=root;for(char c:s.toCharArray())cur=cur.next.computeIfAbsent(c,k->new Node());cur.terminal=true;}
    public boolean contains(String pattern){Node cur=root;for(char c:pattern.toCharArray()){cur=cur.next.get(c);if(cur==null)return false;}return true;}
}
