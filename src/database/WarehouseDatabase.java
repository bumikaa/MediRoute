package database;
import java.util.*;import model.Warehouse;
public class WarehouseDatabase { private final List<Warehouse> warehouses=new ArrayList<>();public void add(Warehouse w){warehouses.add(w);}public List<Warehouse> all(){return warehouses;} }
