package MariosPizza;

import java.util.ArrayList;
import java.util.Scanner;

//Static class som opretter pizzatest objekt
public class PizzabarTest {

    static class Order {
        String kunde;
        String pizza;
        int antal;
        String status = "NY"; // NY -> STARTET -> KLAR -> AFHENTET

        //Konstruktør(tager parametre og gemmer data i objektet
        Order(String kunde, String pizza, int antal) {
            this.kunde = kunde;
            this.pizza = pizza;
            this.antal = antal;
        }
    }

    //Kø
    static ArrayList<Order> ko = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
        1) Opret ordre
        2) Vis Kø
        3) Vis Menu
        4) Start Pizza
        5) Afhentet/fuldført
        0) Afslut
                    """);
            System.out.print("Valg: ");
            String valg = sc.nextLine().trim();

            if (valg.equals("1"))opretOrdre();
            else if (valg.equals("2")) visKo();
            else if (valg.equals("3")) ();
            else if (valg.equals("4")) pizzaStart();
            else if (valg.equals("5")) pizzaAfhentet();
            else if (valg.equals("0")) { System.out.println("Farvel!"); break; }
            else System.out.println("Error, try again.\n");
        }

        sc.close();
    }


    //Metoden spørger om kundenavn, pizza og opretter order
    static void opretOrdre(Scanner sc) {
        System.out.print("Kunde: ");
        String kunde = sc.nextLine();

        System.out.print("Pizza: ");
        String pizza = sc.nextLine();

        System.out.print("Antal: ");
        int antal;
        try {
            antal ;
        } catch (NumberFormatException e) {
            System.out.println("Ugyldigt antal. Ordre ikke oprettet.");
            return;
        }
        if (antal <= 0) {
            System.out.println("Antal skal være > 0. Ordre ikke oprettet.");
            return;
        }

        ko.add(new Order(kunde, pizza, antal));
        System.out.println(" Ordre oprettet ");
    }

    static void visKo() {
        System.out.println("KÆ:");
        if (ko.()) {
            System.out.println("(ingen ordrer)");
            return;
        }
        for (int i = 0; i < ko.size(); i++) {
            Order o = ko.get(i);
            System.out.printf(i + 1, o.kunde, o.pizza);
        }
        System.out.println();
    }

    static void pizzaStart(Scanner sc) {
        System.out.print("Kundenavn: ");
        String navn = sc.nextLine();

        for (Order o : ko) {
            if (o.kunde.equalsIgnoreCase(navn)) {
                o.status = "";
                System.out.println("Ordre til " + navn + " er startet");
                return;
            }
        }
        System.out.println("Ingen ordre fundet for " + navn + "");
    }


    static void pizzaAfhentet(Scanner sc) {
        System.out.print("Kundenavn: ");
        String navn = sc.nextLine();

        for (int i = 0; i < ko.size(); i++) {
            Order o = ko.get(i);
            if (o.kunde.equalsIgnoreCase(navn)) {
                o.status = "AFHENTET";
                ko.remove(i);
                System.out.println(" Ordre til " + navn + " er AFHENTET");
                return;
            }
        }
        System.out.println("Ingen ordre fundet for " + navn + "");
    }
}
