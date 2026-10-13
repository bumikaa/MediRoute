package model;
public class Hospital {
    private final int id; private final String name, location; private final int priority;
    public Hospital(int id,String name,String location,int priority){this.id=id;this.name=name;this.location=location;this.priority=priority;}
    public int getId(){return id;} public String getName(){return name;} public String getLocation(){return location;} public int getPriority(){return priority;}
    public String toString(){return String.format("%d | %-20s | %-12s | Priority=%d",id,name,location,priority);}
}
