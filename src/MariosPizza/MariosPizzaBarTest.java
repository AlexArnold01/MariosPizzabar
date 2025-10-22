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
        System.out.println("Menu:\n1:Add a pizza\n2:Remove a pizza\n3:Show Current orders\n4:Show Menu\n5:Wipe Transaction history");
    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);

        PizzaList pizzaList = new PizzaList();
        boolean running = true;

        while (running == true) {
            String menuInput = sc.nextLine().trim();
            int userInput;
            try {
                userInput = Integer.parseInt(menuInput);
            }catch(NumberFormatException e) {
                System.out.println("du skal bruge tal");
                continue;
            }
            switch (userInput) {

                case 1:
                    System.out.println("Vælge pizza:" + "\nVesuvio");
                    String input = sc.nextLine().trim().toUpperCase();
                    try {
                        PizzaMenu choice = PizzaMenu.valueOf(input);
                        pizzaList.addPizza(new Pizza(choice, 0));
                        System.out.println("\uD83D\uDCE4pizza er sendt til list\uD83D\uDCE4");
                        printMenu();
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ugyldigt Input");
                        break;
                    }
                case 2:

                    try {


                        printMenu();
                    }catch (IllegalArgumentException e) {

                    }
                case 3:
                   //todo add if statment for null
                    pizzaList.pizzaListIndex();
                    printMenu();

            }
        }
    }

}