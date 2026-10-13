package medroute;

import java.util.*;
import model.*;
import services.*;
import utils.TestData;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Medicine> medicines = TestData.medicines();
    private static final List<Hospital> hospitals = TestData.hospitals();
    private static final List<Warehouse> warehouses = TestData.warehouses();

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("       MEDIROUTE - MEDICAL SUPPLY PLATFORM");
        System.out.println("===============================================");
        System.out.println("Java DSA Demonstration Project\n");
        boolean running = true;
        while (running) {
            printMenu();
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1" -> MedicineSearchService.search(medicines, sc);
                case "2" -> InventoryService.show(medicines, warehouses);
                case "3" -> EmergencyService.checkRequest(sc);
                case "4" -> SupplyAllocationService.allocate();
                case "5" -> DeliveryService.shortestRoute();
                case "6" -> SupplyAllocationService.matchHospitals();
                case "7" -> showData();
                case "8" -> AlgorithmDemo.run(sc);
                case "0" -> running = false;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
        System.out.println("\nThank you for using MediRoute.");
    }

    private static void printMenu() {
        System.out.println("\n---------------- MAIN MENU ----------------");
        System.out.println("1. Search Medicine (KMP + Edit Distance)");
        System.out.println("2. View Inventory");
        System.out.println("3. Emergency Request (Aho-Corasick)");
        System.out.println("4. Allocate Supplies (Max Flow)");
        System.out.println("5. Find Delivery Route (Dijkstra)");
        System.out.println("6. Hospital-Supply Matching");
        System.out.println("7. View Hospitals / Warehouses / Medicines");
        System.out.println("8. DSA Algorithm Demonstrations");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private static void showData() {
        System.out.println("\nMEDICINES");
        medicines.forEach(System.out::println);
        System.out.println("\nHOSPITALS");
        hospitals.forEach(System.out::println);
        System.out.println("\nWAREHOUSES");
        warehouses.forEach(System.out::println);
    }
}
