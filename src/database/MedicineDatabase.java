package database;
import java.util.*;import model.Medicine;
public class MedicineDatabase { private final List<Medicine> medicines=new ArrayList<>();public void add(Medicine m){medicines.add(m);}public List<Medicine> all(){return medicines;} }
