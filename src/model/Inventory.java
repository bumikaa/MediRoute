package model;
public class Inventory {
    private final int medicineId, warehouseId; private int quantity;
    public Inventory(int medicineId,int warehouseId,int quantity){this.medicineId=medicineId;this.warehouseId=warehouseId;this.quantity=quantity;}
    public int getMedicineId(){return medicineId;} public int getWarehouseId(){return warehouseId;} public int getQuantity(){return quantity;}
}
