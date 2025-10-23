package MariosPizza;

import java.io.*;

public class FileHandler {

    public void writeToActive(Pizza order, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
            writer.write(order.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
