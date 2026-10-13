package database;
import java.util.*;import model.Hospital;
public class HospitalDatabase { private final List<Hospital> hospitals=new ArrayList<>();public void add(Hospital h){hospitals.add(h);}public List<Hospital> all(){return hospitals;} }
