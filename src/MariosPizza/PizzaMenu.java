package MariosPizza;

public enum PizzaMenu {
    Vesuvio(1),
    Amerikaner(2),
    Cacciatore(3),
    Carbona(4),
    Dennis(5),
    Bertil(6),
    Silvia(7),
    Victoria(8),
    Toronfo(9),
    Capricciosa(10),
    Hawaii(11),
    Blissola(12),
    Venezia(13),
    Mafia(14);

    int Number;

    PizzaMenu (int Number){
        this.Number = Number;
    }
}
