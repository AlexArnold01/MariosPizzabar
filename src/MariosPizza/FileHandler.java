package MariosPizza;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {


    public void writeToFile(List<Pizza> orders){
        //TODO - write to said file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orders.csv"))) {
             for(Pizza p : orders) {
                writer.write(p.toString());
                writer.newLine();
            }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }

    public List<Pizza> readFromFile(){ //Læser fra filen, som printer ud i konsollen
        List<Pizza> orders = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("orders.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                orders.add(Pizza.fromFileString(line));
            }
            } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return orders;

        }
        //TODO - read from said file
        //TODO - while loop
        //TODO - try/catch method
        //
    }


