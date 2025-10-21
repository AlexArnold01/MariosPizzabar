package MariosPizza;

public enum PizzaMenu {
    Vesuvio(57),
    Amerikaner(53),
    Cacciatore(57),
    Carbona(63),
    Dennis(65),
    Bertil(57),
    Silvia(61),
    Victoria(61),
    Toronfo(61),
    Capricciosa(61),
    Hawaii(61),
    Blissola(61),
    Venezia(61),
    Mafia(61);

    int Price;

    MariosPizza (int Price){
        this.Price = Price;
    }
}
