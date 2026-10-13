package model;
public class Medicine {
    private final int id; private final String name, category; private int quantity;
    public Medicine(int id,String name,String category,int quantity){this.id=id;this.name=name;this.category=category;this.quantity=quantity;}
    public int getId(){return id;} public String getName(){return name;} public String getCategory(){return category;} public int getQuantity(){return quantity;}
    public void setQuantity(int q){quantity=q;}
    public String toString(){return String.format("%d | %-18s | %-14s | Qty=%d",id,name,category,quantity);}
}
