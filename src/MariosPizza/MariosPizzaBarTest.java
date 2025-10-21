package MariosPizza;

import java.util.Scanner;
import java.time.LocalDateTime;

public class MariosPizzaBarTest {
    // SETUP
    // - 1. Test klasse skal kunne vise et display interface
    //(Konsol UI)-1.Vis Menu -2. Opret ordre -3. Vis kø -4. Marker status -5.marker hentet/ikke hentet -6.Afslut/start forfra
    // Opret ordre
    // tjek id og status
    // - 2. Beregning
    // beregn og tjek pris er korrekt
    // - 3. Sorter pizza kø
    //tjek efter pizzaer med samme afhentningstid
    //Hent sorteret liste
    //Tjek liste er korrekt
    // - 4. Skift status
    //kald metoder
    //tjek status
    //ændring af ordrer status
    // - 5. færdiggøring af ordrer
    //kalde relevante metoder til ændring og sletning af ordrer
    // - 6. start program forfra
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=== Konsol ===");
            while (true) {
                System.out.println("""
                1) Opret ordre (TEST)
                2) Opret ordre 
                3) Vis kø
                4) Markér (startet)
                5) Markér afhentning_klar
                6) Fuldfør ordre
                7) Vis menu
                9) Afslut
            """);
                System.out.print("Valg: ");
                switch (sc.nextLine()) {
                    case "1" -> ();
                    case "2" -> ();
                    case "3" -> ();
                    case "4" -> ();
                    case "5" -> ();
                    case "6" -> ();
                    case "7" -> ();
                    case "9" -> { System.out.println("Farvel!"); return; }
                    default -> System.out.println("Ugyldigt valg.");
                }
            }
        }

            Object filehandler;
            filehandler.writeToFile();
        }
    



    public static void opretOrdre() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kundenavn: ");
        String navn = sc.nextLine();

        System.out.print("Pizza navn: ");
        String pizza = sc.nextLine();

        System.out.print("Pris pr. pizza: ");
        double pris = sc.nextDouble();

        System.out.print("Antal: ");
        int antal = sc.nextInt();

        double total = pris * antal;

        System.out.println("Ordre oprettet!");
        System.out.println("Kunde: " + navn);
        System.out.println("Pizza: " + pizza + " x" + antal);
        System.out.println("Total: " + total + " kr");
    }
    




    static class Order {
        int id;
        String kunde;
        String pizza;
        String status;

        Order(int id, String kunde, String pizza) {
            this.id = id;
            this.kunde = kunde;
            this.pizza = pizza;
            this.status = "NY";
        }
    }


    static class Order {
        int id;
        String kunde;
        String pizza;
        String status;

        Order(int id, String kunde, String pizza) {
            this.id = id;
            this.kunde = kunde;
            this.pizza = pizza;
            this.status = "NY";
        }
    }


    static ArrayList<Order> queue = new ArrayList<>();

    public static void markeSomStartet(int id) {
        for (Order o : queue) {
            if (o.id == id) {
                o.status = "STARTET";
                System.out.println(" Ordre #" + id + " er nu startet!");
                return;
            }
        }
        System.out.println(id);
    }

    public static void main(String[] args) {
        queue.add(new Order(1, "Lukas", "Margherita"));
        queue.add(new Order(2, "Maria", "Pepperoni"));

        startedMarked(2);
    }
}















































public OrderTest {

    public testCreateOrder() {
        OrderItem item = makeItem("Margherita", 75, 2);


        public void testTotal () {
            OrderItem i1 = makeItem("Margherita", 75, 2);
            OrderItem i2 = makeItem("Pepperoni", 90, 1);


        }
    }
}



