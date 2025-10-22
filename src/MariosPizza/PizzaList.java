package MariosPizza;

import java.util.ArrayList;

public class PizzaList {
    private ArrayList<Pizza> Pizzas = new ArrayList<>();

    //adds Pizzas to the arrayList
    public void addPizza(Pizza pizza){
        Pizzas.add(pizza);
    }

    //arrayList Index
    public void pizzaListIndex() {
        System.out.println("Active orders:");
        for(int i=0; i < Pizzas.size(); i++) {
            System.out.println(i + 1 + ": " + Pizzas.get(i).toString());
        }
    }
    //removes Pizza from list
    public void RemovedPizzas(int index) {
            try {
                Pizza pizza = Pizzas.get(index);
                PizzaMenu items = pizza.getItems();


                Pizzas.remove(index);
                System.out.println("Pizza removed: " + items);

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: Pizza in index" + index);
            }

    }
}