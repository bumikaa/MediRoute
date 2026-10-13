package model;
public class Warehouse {
    private final int id; private final String name, location; private final int capacity;
    public Warehouse(int id,String name,String location,int capacity){this.id=id;this.name=name;this.location=location;this.capacity=capacity;}
    public int getId(){return id;} public String getName(){return name;} public String getLocation(){return location;} public int getCapacity(){return capacity;}
    public String toString(){return String.format("%d | %-20s | %-12s | Capacity=%d",id,name,location,capacity);}
}
