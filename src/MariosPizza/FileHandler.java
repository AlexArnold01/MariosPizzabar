package MariosPizza;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {


    private String csvToPizza(String line) {
        String[] tokens = line.split(",");
        String name = "";
        double price = 0.0;
        try {
            name = tokens[0].trim();
            price = Double.parseDouble(tokens[1].trim());

            PizzaMenu pizzaMenu = PizzaMenu.valueOf(name);
        } catch (NumberFormatException | IllegalArgumentException e) {
            return null;
        }
        return new Pizza(price);
    }

    private String pizzaToCSV(Pizza pizza) {
        PizzaMenu menuItem = PizzaMenu.valueOf(pizza.getName());
        return menuItem + ", " + pizza.getPrice();
    }

    public void writeToFile(List<Pizza> orders) {
        //TODO - write to said file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orders.csv"))) {
            for (Pizza p : orders) {
                writer.write(pizzaToCSV(p));
                writer.newLine();
                writer.close();
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
                reader.close();
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


