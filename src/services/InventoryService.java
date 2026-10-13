package services;
import java.util.*;import model.*;
public class InventoryService { public static void show(List<Medicine> meds,List<Warehouse> ws){System.out.println("\n================ INVENTORY ================");for(Medicine m:meds)System.out.println(m);System.out.println("\nWarehouses:");ws.forEach(System.out::println);System.out.println("Total medicine units: "+meds.stream().mapToInt(Medicine::getQuantity).sum());} }
