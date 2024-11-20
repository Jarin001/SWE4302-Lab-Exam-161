import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Invoice {
    public List<Order> readOrder(String filePath) {
        List<Order> order = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] parts = line.split(",");
                String flavour = parts[0].trim();
                String toppings = parts[1].trim();
                String cone = parts[2].trim();
                double subtotal = Double.parseDouble(parts[3].trim());
                double tax = Double.parseDouble(parts[4].trim());
                double total = Double.parseDouble(parts[5].trim());

                order.add(new Order(flavour,toppings,cone,subtotal,tax,total));
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
        return order;
    }
}
