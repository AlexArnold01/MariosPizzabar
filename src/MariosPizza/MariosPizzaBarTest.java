package MariosPizza;


import java.util.Scanner;

public class MariosPizzaBarTest {
    public static void main(String[] args) {
        printConsolMenu();
        userInput();
    }

    //Prints the ConsolMenu.
    public static void printConsolMenu() {
        System.out.println("\nPlease choose an option:\n1)Add an order\n2)Remove an order\n3)Show Current orders\n4)Show Menu\n5)Shutdown");
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
        FileHandler fileHandler = new FileHandler(); //

        //ArrayList
        PizzaList pizzaList = new PizzaList();
        HistoryList historyList = new HistoryList();

        boolean running = true;

        while (running == true) {
            //checks if numbers are used or not.
            String menuInput = sc.nextLine().trim();
            int userInput;
            try {
                userInput = Integer.parseInt(menuInput);
            } catch (NumberFormatException e) {
                System.out.println("Use a number:");
                continue;
            }
            //system
            switch (userInput) {
                case 1: //checks if letters are used and turn them all to Uppercase.
                    //then adds pizza from enum to arraylists.
                    System.out.println("Enter pizza:");
                    String input = sc.nextLine().trim().toUpperCase();
                    try {
                        //adds the pizza to PizzaList.
                        PizzaMenu choice = PizzaMenu.valueOf(input);
                        pizzaList.addPizza(new Pizza(choice, 0));
                        System.out.println("\uD83D\uDCE4Order sent to the kitchen\uD83D\uDCE4");
                        fileHandler.writeToActive(new Pizza(choice, 01), "OrderHistory.csv");
                        //adds the pizza to HistoryList.
                        PizzaMenu choiceB = PizzaMenu.valueOf(input);
                        historyList.addRemovedPizza(new Pizza(choiceB, 0));

                        printConsolMenu();

                    } catch (IllegalArgumentException e) {
                        System.out.println("⚠️Invalid input⚠️");
                        System.out.println("Returning to menu...");
                        printConsolMenu();

                    }
                    break;
                case 2: //removes pizzas from the PizzaList.
                    try {
                        System.out.println("Write the index of the order you want to remove");
                        pizzaList.pizzaListIndex();
                        pizzaList.removePizzas(sc.nextInt() - 1);
                        printConsolMenu();
                    } catch (NumberFormatException e) {
                        System.out.println("⚠️Invalid input⚠️" + e.getMessage());
                        System.out.println("Returning to menu...");
                        printConsolMenu();
                    }
                    break;
                case 3: //prints arraylist and check if it's empty or not.
                    if (pizzaList.isEmpty()) {
                        System.out.println("List is empty");
                        printConsolMenu();
                    } else {
                        pizzaList.pizzaListIndex();
                        printConsolMenu();
                    }
                    break;
                case 4://prints out the menu.
                    printMenu();
                    break;
                case 5:
                    System.out.println("Closing program...");
                    running = false;
                    break;
                default:
                    System.out.println("⚠️Invalid input⚠️");
                    printConsolMenu();
                    break;
            }
        }
    }

}