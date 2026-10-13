package database;
import java.util.*;import model.Inventory;
public class InventoryDatabase { private final List<Inventory> inventory=new ArrayList<>();public void add(Inventory i){inventory.add(i);}public List<Inventory> all(){return inventory;} }
