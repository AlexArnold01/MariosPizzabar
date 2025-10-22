package MariosPizza;

//import java.time.LocalDateTime;
import java.util.Scanner;

public class PizzabarTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PizzaList pizzaList = new PizzaList();
        HistoryList historyList = new HistoryList();
        boolean running = true;

        System.out.println("Mario’s Pizzabar");

        while (running) {
            System.out.println("-PIZZA KONSOL-");
            System.out.println("1) Tilføj Pizza");
            System.out.println("2) Fjern Pizza");
            System.out.println("3) Vis Menu");
            System.out.println("4) Vis Ordrer Liste");
            System.out.println("5) Slet Pizza Ordrer Historik");
            System.out.println("0) Afslut Program ");
            System.out.print("Vælg Funktion: ");

            String valg = sc.nextLine(); //sc.nextInt();??

            switch (valg) {

                case "1":
                    System.out.print("Pizza navn: ");
                    String name = sc.nextLine();
                    System.out.print("Pizza pris: ");
                  //  int price = int(sc.nextLine());
                    Pizza newPizza = new Pizza(price, name,);
                    pizzaList.addPizza(newPizza);
                    System.out.println(" Tilføjet pizza: " + name);
                    break;

                case "2":
                    if (pizzaList.Pizzas.isEmpty()) {
                        System.out.println("Ingen pizzaer at fjerne");
                        break;
                    }
                    pizzaList.PizzaList();
                    System.out.print("Indtast PizzaID som skal fjernes: ");
                   // int index = int(sc.nextLine()) - 1;
                    if (index >= 0 && index < pizzaList.Pizzas.size()) {
                        Pizza removed = pizzaList.Pizzas.get(index);
                        historyList.addRemovedPizza(removed);
                        pizzaList.RemovedPizzas(index);
                    } else {
                        System.out.println("Ugyldigt, prøv igen:");
                    }
                    break;

                case "3":
                    System.out.println("MENU");
                    if (pizzaList.Pizzas.isEmpty()) {
                        System.out.println("(Ingen pizzaer på menuen)");
                    } else {
                        pizzaList.PizzaList();
                    }
                    break;

                case "4":
                    System.out.println("Ordrer liste");
                    if (pizzaList.Pizzas.isEmpty()) {
                        System.out.println("(Ingen aktive ordrer)");
                    } else {
                        pizzaList.PizzaList();
                    }
                    break;

                case "5":

                    System.out.println("Slet pizza historik ");
                    if (historyList.RemovedPizzas.isEmpty()) {
                        System.out.println("(Listen er tom)");
                    } else {
                        historyList.WipePizzas(0);
                    }
                    break;

                case "0":
                    running = false;
                    System.out.println("Afslutter program, Farvel. ");
                    break;

                default:
                    System.out.println("Ugyldigt input, Prøv igen: ");
                    break;
            }
        }
        sc.close();
    }
}
