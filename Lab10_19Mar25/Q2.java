/*
Write a program in Java to copy the content of a given file to another
user entered file using character stream (using File Reader and FileWriter Classes) and
byte Stream (using FileInputStream and FileOutputStream Class).
 */

import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter source file path: ");
        String sourcePath = scanner.nextLine();
        
        System.out.print("Enter destination file path (character stream): ");
        String charDestPath = scanner.nextLine();
        
        System.out.print("Enter destination file path (byte stream): ");
        String byteDestPath = scanner.nextLine();
        
        scanner.close();
        
        // Character stream copy (FileReader and FileWriter)
        try (FileReader reader = new FileReader(sourcePath);
             FileWriter writer = new FileWriter(charDestPath)) {
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied successfully using character stream!");
        } catch (IOException e) {
            System.err.println("Character stream error: " + e.getMessage());
        }
        
        // Byte stream copy (FileInputStream and FileOutputStream)
        try (FileInputStream in = new FileInputStream(sourcePath);
             FileOutputStream out = new FileOutputStream(byteDestPath)) {
            
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            System.out.println("File copied successfully using byte stream!");
        } catch (IOException e) {
            System.err.println("Byte stream error: " + e.getMessage());
        }
    }
}