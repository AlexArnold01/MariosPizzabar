package MariosPizza;

import java.lang.classfile.constantpool.IntegerEntry;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//Static class som opretter pizzatest objekt
public class MariosPizzaBarTest {
    public static void main(String[] args) {
        printMenu();
        userInput();
    }
    public static void printMenu() {
        System.out.println("Menu\n1:AddPizza");
    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);

        PizzaList pizzaList = new PizzaList();
        boolean running = true;

        while (running == true) {
            int userInput = sc.nextInt();
            String input = toUpperCase();
            switch (userInput) {

                case 1:
                    try {
                        System.out.println("Vælge pizza:" + "\nVesuvio");
                        sc.nextInt();
                        PizzaMenu valg = PizzaMenu.valueOf(input);
                        pizzaList.addPizza(new Pizza(valg,0));
                        System.out.println("pizza er sendt til list");

                    } catch (IllegalArgumentException e) {
                        System.out.println("Ugyldigt Input");
                    }
            }
        }
    }

}