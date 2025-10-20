package MariosPizza;

import java.io.*;
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

    public readFromFile(){ //Læser fra filen, som printer ud i konsollen
        //TODO - read from said file
        //TODO - while loop
        //TODO - try/catch method
        //
    }
}

