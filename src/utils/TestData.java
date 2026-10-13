package utils;
import java.util.*; import model.*;
public class TestData {
    public static List<Medicine> medicines(){return new ArrayList<>(List.of(
        new Medicine(1,"Paracetamol","Analgesic",750), new Medicine(2,"Amoxicillin","Antibiotic",420),
        new Medicine(3,"Insulin","Hormone",180), new Medicine(4,"Ibuprofen","Analgesic",500),
        new Medicine(5,"Azithromycin","Antibiotic",300), new Medicine(6,"Oxygen Cylinder","Emergency",120)));}
    public static List<Hospital> hospitals(){return new ArrayList<>(List.of(
        new Hospital(1,"City Care Hospital","Vijayawada",1),new Hospital(2,"Metro General","Guntur",2),new Hospital(3,"LifeLine Hospital","Eluru",1),new Hospital(4,"Sunrise Medical","Amaravati",3)));}
    public static List<Warehouse> warehouses(){return new ArrayList<>(List.of(
        new Warehouse(1,"Central Warehouse","Vijayawada",1000),new Warehouse(2,"North Warehouse","Guntur",800),new Warehouse(3,"Emergency Depot","Eluru",500)));}
}
