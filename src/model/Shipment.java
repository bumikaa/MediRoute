package model;
public class Shipment {
    private final int id,warehouseId,hospitalId,quantity;
    public Shipment(int id,int warehouseId,int hospitalId,int quantity){this.id=id;this.warehouseId=warehouseId;this.hospitalId=hospitalId;this.quantity=quantity;}
    public String toString(){return "Shipment #"+id+": W"+warehouseId+" -> H"+hospitalId+" | quantity="+quantity;}
}
