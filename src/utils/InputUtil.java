package utils;
import java.util.Scanner;
public class InputUtil { public static String readLine(Scanner sc,String prompt){System.out.print(prompt);return sc.nextLine().trim();} public static int readInt(Scanner sc,String prompt){while(true){try{return Integer.parseInt(readLine(sc,prompt));}catch(Exception e){System.out.println("Enter a valid integer.");}}} }
