package MariosPizza;

import java.lang.classfile.constantpool.IntegerEntry;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MariosPizzaBarTest {
    public static void main(String[] args) {
        printConsolMenu();
        userInput();
    }
    //Prints the ConsolMenu.
    public static void printConsolMenu() {
        System.out.println("Options:\n1)Add a pizza\n2)Remove a pizza\n3)Show Current orders\n4)Show Menu\n5)Wipe Transaction history");
    }
    //Prints the Menu.
    public static void printMenu() {
        System.out.println("Menu:");
        for (PizzaMenu pizzaMenu : PizzaMenu.values()) {
            System.out.println(pizzaMenu);
        }
    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);

        PizzaList pizzaList = new PizzaList();
        HistoryList historyList = new HistoryList();
        boolean running = true;

        while (running == true) {
            //checks if numbers are used or not.
            String menuInput = sc.nextLine().trim();
            int userInput;
            try {
                userInput = Integer.parseInt(menuInput);
            }catch(NumberFormatException e) {
                System.out.println("du skal bruge tal");
                continue;
            }
            //system
            switch (userInput) {
                case 1: //checks if letters are used and turn them all to Uppercase.
                        //then adds pizza from enum to arraylists.
                    System.out.println("skrive en pizza ind");
                    String input = sc.nextLine().trim().toUpperCase();
                    try {
                        //adds the pizza to PizzaList.
                        PizzaMenu choice = PizzaMenu.valueOf(input);
                        pizzaList.addPizza(new Pizza(choice, 0));
                        System.out.println("\uD83D\uDCE4pizza er sendt til list\uD83D\uDCE4");

                        //adds the pizza to HistoryList.
                        PizzaMenu choiceB = PizzaMenu.valueOf(input);
                        historyList.addRemovedPizza(new Pizza(choiceB, 0));

                        printConsolMenu();
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ugyldigt Input");
                        break;
                    }
                case 2: //removes pizzas from the PizzaList.
                    System.out.println("skrive index number på pizza der skal fjernes");
                    try {
                        pizzaList.removePizzas(sc.nextInt()-1);
                        printConsolMenu();
                        break;
                    }catch (IllegalArgumentException e) {
                        System.out.println("Ugyldigt Input");
                        break;
                    }
                case 3: //prints arraylist and check if it's empty or not.
                    pizzaList.pizzaListIndex();
                    printConsolMenu();
                    break;
                case 4://prints out the menu.
                    printMenu();
                    break;
                case 5://wipes all pizzas from the HistoryList array.
                    historyList.WipePizzas();
            }
        }
    }

}