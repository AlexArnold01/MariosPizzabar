package MariosPizza;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    public void writeToActive(Pizza order, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
            writer.write(order.toCSV());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFromActive() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ActiveOrders.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
