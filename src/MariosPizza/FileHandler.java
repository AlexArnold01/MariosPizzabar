package MariosPizza;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {


    private String csvToPizza(String line) {
        String[] tokens = line.split(",");
        String ;
//        int size = 0;
        double price = 0.0;
        try {
            name = tokens[0];
//            size = Integer.parseInt(tokens[1]);
            price = Double.parseDouble(tokens[2]);
        } catch (NumberFormatException e) {
            return null;
        }
        return new Pizza(size, price);
    }

    private String pizzaToCSV(Pizza pizza) {
        return pizza.getName().valueOf() + ", " + pizza.getSize() + ", " + pizza.getPrice();
    }

    public void writeToFile(List<Pizza> orders) {
        //TODO - write to said file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orders.csv"))) {
            for (Pizza p : orders) {
                writer.write(pizzaToCSV(p));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Pizza> readFromFile() { //Læser fra filen, som printer ud i konsollen
        List<Pizza> orders = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("orders.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Pizza tempPizza = csvToPizza(line);
                if (tempPizza != null) {
                    orders.add(tempPizza);
                } else {
                    System.out.println("fejl");
                }
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


