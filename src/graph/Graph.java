package graph;
import java.util.*;
public class Graph { private final List<List<Edge>> adj; public Graph(int n){adj=new ArrayList<>();for(int i=0;i<n;i++)adj.add(new ArrayList<>());} public void addEdge(int u,int v,int w){adj.get(u).add(new Edge(v,w));} public void addUndirectedEdge(int u,int v,int w){addEdge(u,v,w);addEdge(v,u,w);} public List<Edge> edges(int u){return adj.get(u);} public int size(){return adj.size();} }
