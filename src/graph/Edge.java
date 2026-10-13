package graph;
public class Edge { public final int to,weight,capacity; public Edge(int to,int weight){this(to,weight,0);} public Edge(int to,int weight,int capacity){this.to=to;this.weight=weight;this.capacity=capacity;} }
